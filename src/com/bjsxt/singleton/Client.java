package com.bjsxt.singleton;

import java.lang.reflect.Constructor;

public class Client {
	public static void main(String[] args) throws Exception {
		SingletonDemo2 s1=SingletonDemo2.getInstance();
		SingletonDemo2 s2=SingletonDemo2.getInstance();
		
		Class<SingletonDemo2> clazz = (Class<SingletonDemo2>) Class.forName("com.bjsxt.singleton.SingletonDemo2");
		Constructor<SingletonDemo2> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		System.out.println("这后面的要报错的");
		SingletonDemo2  s3 = c.newInstance();
		SingletonDemo2  s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);

	}
}
