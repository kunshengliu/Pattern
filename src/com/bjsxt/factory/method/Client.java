package com.bjsxt.factory.method;

import com.bjsxt.factory.Car;

public class Client {
	public static void main(String [] args){
		CarFactory carFactory = new AudiFactory();//��Ҫ֪������
		Car car = carFactory.createCar();//��������
		car.run();//ʵ������
	}
}

