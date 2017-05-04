package com.bjsxt.proxy.statics;

public class ProxyStar implements Star{
	private Star star;
	
	public ProxyStar(Star star){
		this.star=star;
	}
	
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("haha");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("haha");

	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("haha");

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void money() {
		System.out.println("haha");

		// TODO Auto-generated method stub
		
	}

}
