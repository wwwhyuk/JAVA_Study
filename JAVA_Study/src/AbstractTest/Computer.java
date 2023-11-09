package AbstractTest;

public abstract class Computer {
	public abstract void typing();
	public abstract void display();
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");		
	}
}
