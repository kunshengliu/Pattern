package com.bjsxt.factory.method;

import com.bjsxt.factory.Car;

public class Client {
	public static void main(String [] args){
		CarFactory carFactory = new AudiFactory();//需要知道工厂
		Car car = carFactory.createCar();//工厂方法
		car.run();//实例方法
	}
}

