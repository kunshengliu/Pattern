package com.bjsxt.decorator;

public class Client {
	public static void main(String[] args) {
		Car car =new Car();
		car.move();
		System.out.println("*********************");
		FlyCar f =new FlyCar(car);
		f.move();
		System.out.println("*********************");
		AiCar a =new AiCar(f);
		a.move();
	}
}
