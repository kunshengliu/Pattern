package com.bjsxt.adapter.duixiang;
/**
 * ÊÊÅäÆ÷±¾Éí
 * @author liukunsheng
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	@Override
	public void handleReq() {
		adaptee.requset();
	}
	
}
