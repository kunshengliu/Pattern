package com.bjsxt.factory.method;

import com.bjsxt.factory.Audi;
import com.bjsxt.factory.Car;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
