package com.bjsxt.decorator;
/**
 * װ������ģʽ
 * @author liukunsheng
 *
 */
public interface ICar {
	void move();
}
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("·��pao");
	}	
}
//װ����
class SuperCar implements ICar{
	protected ICar car;
	public SuperCar(ICar car){
		this.car=car;
	}
	@Override
	public void move() {
		car.move();
	}	
}
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("�ɷ�");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}
class AiCar extends SuperCar{

	public AiCar(ICar car) {
		super(car);
	}
	public void ai(){
		System.out.println("˵��");
	}
	@Override
	public void move() {
		super.move();
		ai();
	}
}