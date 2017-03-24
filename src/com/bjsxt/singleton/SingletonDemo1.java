package com.bjsxt.singleton;
/**
 * 饿汉式单例模式
 * @author liukunsheng
 *
 */
public class SingletonDemo1 {
	private SingletonDemo1(){}//构造函数私有化
	
	private static SingletonDemo1 instance =  new SingletonDemo1();
	//类初始化时立即加载(没有延迟加载)
	public static SingletonDemo1 getInstance(){
		return instance;
	}	
}
