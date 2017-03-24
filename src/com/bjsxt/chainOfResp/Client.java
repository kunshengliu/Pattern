package com.bjsxt.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader a =new Director("主任");
		Leader b =new Manager("经理");
		//关系
		a.setNextLeader(b);
		//开始请假
		LeaveRequset re = new LeaveRequset("wo", 2, "睡觉");
		a.handleRequset(re);
		
		
		
	}
}
