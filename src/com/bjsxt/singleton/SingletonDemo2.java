package com.bjsxt.singleton;
/**
 * ����ʽ����ģʽ
 * @author liukunsheng
 *
 */
public class SingletonDemo2 {
	private SingletonDemo2(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}//���췽��˽�л�
	private static SingletonDemo2 instance;
	//�ӳټ��أ������õ���ʱ���ٴ���ʵ��
	//����ͬ��������Ч�ʱȽϵ�
	public static SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		return instance;
	}	
}
