package com.bjsxt.factory.abstractFactory;

public class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("好的发动机1");
	}

	@Override
	public void start() {
		System.out.println("好的发动机2");
	}

}
