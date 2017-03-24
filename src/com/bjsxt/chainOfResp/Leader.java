package com.bjsxt.chainOfResp;
/**
 * 抽象类
 * @author liukunsheng
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	public void setNextLeader(Leader nextLeader){
		this.nextLeader=nextLeader;
	}
	/**
	 * 处理请求的核心方法
	 * @param requst
	 */
	public abstract void handleRequset(LeaveRequset requst);
}
