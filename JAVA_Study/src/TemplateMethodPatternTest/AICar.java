package TemplateMethodPatternTest;

public class AICar extends Car {

	@Override
	public void run() {
		System.out.println("AI 자동차 운전");
		
	}

	@Override
	public void cleanCar() {
		System.out.println("AI 자동차 세척");
	}

}
