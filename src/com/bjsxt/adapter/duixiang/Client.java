package com.bjsxt.adapter.duixiang;
/**
 * �ͻ���
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
		Adaptee a=new Adaptee();//��Ҫ������Ķ���ԭ��
		Target t = new Adapter(a);// ���������		
		t.handleReq();//client ������������������
		
		
		
	}
}
