package TemplateMethodPatternTest;

public class ManualCar extends Car{

	@Override
	public void run() {
		System.out.println("일반 자동차 운전");
	}

	@Override
	public void cleanCar() {
		System.out.println("일반 자동차 세척");
	}

}
