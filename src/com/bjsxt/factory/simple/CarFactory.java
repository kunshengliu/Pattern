package com.bjsxt.factory.simple;

import com.bjsxt.factory.Audi;
import com.bjsxt.factory.Bmw;
import com.bjsxt.factory.Car;

/**
 * �򵥹�����
 * @author liukunsheng
 *
 */
public class CarFactory {
	public static Car createCar(String type){
		if("�µ�".equals(type)){
			return new Audi();
		}else if("����".equals(type)){
			return new Bmw();
		}
		else{
			return null;
		}
	}
}
