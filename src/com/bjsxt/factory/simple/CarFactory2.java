package com.bjsxt.factory.simple;
/**
 * �򵥹���ģʽ
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
