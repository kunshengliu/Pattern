package com.bjsxt.strategy;
/**
 * ����;���Ĳ����ύ��
 * �����Ļ���������㷨��ֱ�ӵĿͻ��˵��÷���
 * @author liukunsheng
 *
 */
public class Context {
	private Strategy strategy;//��ǰ���õ��㷨
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void dosomething(double sds){
		strategy.getPrice(sds);
	}
	
	
}
