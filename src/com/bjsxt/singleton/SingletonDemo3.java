package com.bjsxt.singleton;
/**
 * 枚举类单例模式
 * @author liukunsheng
 *
 */
public enum SingletonDemo3 {
	
	//这个枚举元素，本身就是单例对象，没有延迟加载，
	INSTANCE;
	//添加自己需要的操作
	public void  singletonOperation(){
		
	}
}
