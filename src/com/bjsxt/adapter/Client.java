package com.bjsxt.adapter;
/**
 * ¿Í»§Àà
 * @author liukunsheng
 *
 */
public class Client {
	public void test(Target t){
		t.handleReq();
	}
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		Target t = new Adapter(a);
		c.test(t);
		
	}
}
