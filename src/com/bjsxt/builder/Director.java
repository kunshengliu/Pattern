package com.bjsxt.builder;
/**
 * װ����
 * @author liukunsheng
 *
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder=builder;
	}
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}