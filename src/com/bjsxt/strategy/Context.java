package com.bjsxt.strategy;
/**
 * 负责和具体的侧落泪交互
 * 这样的话，具体的算法和直接的客户端调用分类
 * @author liukunsheng
 *
 */
public class Context {
	private Strategy strategy;//当前采用的算法
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void dosomething(double sds){
		strategy.getPrice(sds);
	}
	
	
}
