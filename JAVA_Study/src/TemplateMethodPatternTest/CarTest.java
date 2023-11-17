package TemplateMethodPatternTest;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new AICar();
		c1.method();
		
		Car c2 = new ManualCar();
		c2.method();
	}

}
