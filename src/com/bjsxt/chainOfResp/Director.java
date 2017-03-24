package com.bjsxt.chainOfResp;

public class Director  extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequset(LeaveRequset requst) {
		if(requst.getLeaveDays()<3){
			System.out.println(requst.getEmpName()+":"+requst.getLeaveDays()+":"+this.name+"Åú×¼");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.handleRequset(requst);
			}
		}
	}

}
