package com.bjsxt.builder;
/**
 * �ͻ���
 * @author liukunsheng
 *
 */
public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();//������
		Director director = new Director(builder);//��װ��
		director.construct();//����װ��
		Product product = builder.retrieveResult();//���ؽ��
		System.out.println(product.getPart1()+"   "+product.getPart2());
		
		
		
	}
}
