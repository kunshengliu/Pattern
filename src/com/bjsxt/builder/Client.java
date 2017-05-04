package com.bjsxt.builder;
/**
 * 客户端
 * @author liukunsheng
 *
 */
public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();//创建者
		Director director = new Director(builder);//组装者
		director.construct();//进行装配
		Product product = builder.retrieveResult();//返回结果
		System.out.println(product.getPart1()+"   "+product.getPart2());
		
		
		
	}
}
