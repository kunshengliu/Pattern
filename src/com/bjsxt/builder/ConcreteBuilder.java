package com.bjsxt.builder;

public class ConcreteBuilder implements Builder {
	private Product product  = new Product();

	@Override
	public void buildPart1() {
		product.setPart1("123");
	}

	@Override
	public void buildPart2() {
		product.setPart2(":XXX");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
