package com.bjsxt.factory.simple;

import com.bjsxt.factory.Audi;
import com.bjsxt.factory.Car;

public class Client01 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		c1.run();
		
		Car c2=CarFactory.createCar("°ÂµÏ");
		c2.run();
	}
}
