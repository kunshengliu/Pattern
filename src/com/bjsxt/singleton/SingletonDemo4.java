package com.bjsxt.singleton;
/**
 * 静态内部类
 * @author liukunsheng
 *线程安全，调用高效，并且实现了延时加载。
 */
public class SingletonDemo4 {
	private SingletonDemo4(){
	}//构造器私有化
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance=new SingletonDemo4();
		}
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}




