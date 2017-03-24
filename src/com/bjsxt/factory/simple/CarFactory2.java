package com.bjsxt.factory.simple;

import com.bjsxt.factory.Audi;
import com.bjsxt.factory.Bmw;
import com.bjsxt.factory.Car;

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
