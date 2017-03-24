package com.bjsxt.factory.simple;

import com.bjsxt.factory.Audi;
import com.bjsxt.factory.Bmw;
import com.bjsxt.factory.Car;

/**
 * 简单工厂类
 * @author liukunsheng
 *
 */
public class CarFactory {
	public static Car createCar(String type){
		if("奥迪".equals(type)){
			return new Audi();
		}else if("宝马".equals(type)){
			return new Bmw();
		}
		else{
			return null;
		}
	}
}
