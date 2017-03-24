package com.bjsxt.factory.abstractFactory;

public class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("差的发动机1");
	}

	@Override
	public void start() {
		System.out.println("差的发动机2");
	}

}
