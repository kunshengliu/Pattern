package com.bjsxt.factory.abstractFactory;

public class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("��ķ�����1");
	}

	@Override
	public void start() {
		System.out.println("��ķ�����2");
	}

}
