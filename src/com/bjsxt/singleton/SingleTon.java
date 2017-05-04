package com.bjsxt.singleton;

public class SingleTon {
	private volatile static SingleTon singleton;
	private SingleTon(){}
	public static SingleTon getSingleton(){
		if(singleton==null){
			synchronized (SingleTon.class) {
				singleton = new SingleTon();//����ĸ�Դ���������Ϊ��������
				/**
				 * 1���������Ĵ洢�ռ�
				 * 2����ʼ������
				 * 3�����ö���ָ�� singleton 
				 * ��ʱ��2��3�ᱻ��������
				 * ��ʱ�����һ���߳���new �������Ƚ����ˣ�1,3,û�н���2,
				 * ��ʱ��һ���߳� �����ж��ˣ�singleton==null Ϊfalse��
				 * ���Ծ�ֱ�ӷ����ˣ�����volatile��ͻ��ֹ��������
				 * һ���̵߳�д�����з����ں���һ��������������
				 * 
				 */
			}
		}
		return singleton;
	}
}
