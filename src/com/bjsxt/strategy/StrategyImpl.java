package com.bjsxt.strategy;

public class StrategyImpl implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("impl");

		return 0;
	}

}
