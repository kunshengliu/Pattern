package com.bjsxt.singleton;

public class SingleTon {
	private volatile static SingleTon singleton;
	private SingleTon(){}
	public static SingleTon getSingleton(){
		if(singleton==null){
			synchronized (SingleTon.class) {
				singleton = new SingleTon();//问题的根源，这里面分为三个步骤
				/**
				 * 1、分配对象的存储空间
				 * 2、初始化对象
				 * 3、设置对象指向 singleton 
				 * 有时候2、3会被重新排序
				 * 这时候假如一个线程在new ，但是先进行了，1,3,没有进行2,
				 * 这时候一个线程 进来判断了，singleton==null 为false；
				 * 所以就直接返回了，加了volatile后就会禁止重新排序。
				 * 一个线程的写，先行发生于后面一个变量读操作。
				 * 
				 */
			}
		}
		return singleton;
	}
}
