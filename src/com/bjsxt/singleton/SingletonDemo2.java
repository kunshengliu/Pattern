package com.bjsxt.singleton;
/**
 * 懒汉式单例模式
 * @author liukunsheng
 *
 */
public class SingletonDemo2 {
	private SingletonDemo2(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}//构造方法私有化
	private static SingletonDemo2 instance;
	//延迟加载，真正用到的时候再创建实例
	//方法同步，调用效率比较低
	public static SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		return instance;
	}	
}
