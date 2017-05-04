package com.bjsxt.builder;
/**
 * 抽象建造者类Builder
 * 
 * @author liukunsheng
 *
 */
public interface Builder {
	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
}
