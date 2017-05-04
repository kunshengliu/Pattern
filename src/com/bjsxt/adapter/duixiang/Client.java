package com.bjsxt.adapter.duixiang;
/**
 * 客户类
 * @author liukunsheng
 *
 */
public class Client {
	public void test(Target t){
		t.handleReq();
	}
	public static void main(String[] args) {
/*		Client c = new Client();
		Adaptee a = new Adaptee();
		Target t = new Adapter(a);
		c.test(t);
*/
		Adaptee a=new Adaptee();//需要被适配的对象，原来
		Target t = new Adapter(a);// 定义个适配		
		t.handleReq();//client 调用适配器进行适配
		
		
		
	}
}
