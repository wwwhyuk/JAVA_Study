package TemplateMethodPatternTest;

public abstract class Car {
	public abstract void run(); 
	
	public void cleanCar() {};

	public void turnOn() {
		System.out.println("자동차 시작");
	}

	public void turnOff() {
		System.out.println("자동차 종료");
	}
	
	final public void method() {
		turnOn();
		run();
		turnOff();
		cleanCar();
	}
}
