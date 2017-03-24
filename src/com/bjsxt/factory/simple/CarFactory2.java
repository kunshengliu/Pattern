package com.bjsxt.factory.simple;
/**
 * 简单工厂模式
 * @author liukunsheng
 *
 */
public class CarFactory2 {
	public Car createAudi(){
		return new Audi();
	}
	public Car createBmw(){
		return new Bmw();
	}
}
