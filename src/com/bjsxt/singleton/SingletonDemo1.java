package com.bjsxt.singleton;
/**
 * ����ʽ����ģʽ
 * @author liukunsheng
 *
 */
public class SingletonDemo1 {
	private SingletonDemo1(){}//���캯��˽�л�
	
	private static SingletonDemo1 instance =  new SingletonDemo1();
	//���ʼ��ʱ��������(û���ӳټ���)
	public static SingletonDemo1 getInstance(){
		return instance;
	}	
}
