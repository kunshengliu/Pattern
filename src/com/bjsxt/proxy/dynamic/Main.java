package com.bjsxt.proxy.dynamic;


public class Main {
	
	public static void main(String[] args) {
		ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorLoggingImpl();
		
		arithmeticCalculator = 
				new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();
		
		int result = arithmeticCalculator.add(11, 12);
		//System.out.println("result:" + result);
		
		result = arithmeticCalculator.div(21, 3);
		//System.out.println("result:" + result);

	}
	
}
