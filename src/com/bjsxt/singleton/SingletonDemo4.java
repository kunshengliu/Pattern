package com.bjsxt.singleton;
/**
 * ��̬�ڲ���
 * @author liukunsheng
 *�̰߳�ȫ�����ø�Ч������ʵ������ʱ���ء�
 */
public class SingletonDemo4 {
	private SingletonDemo4(){
	}//������˽�л�
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance=new SingletonDemo4();
		}
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}




