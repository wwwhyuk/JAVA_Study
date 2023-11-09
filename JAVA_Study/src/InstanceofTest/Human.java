package InstanceofTest;

public class Human extends Animal{
	@Override
	public void move() {
		System.out.println("human move");
	}
	
	public void read() {
		System.out.println("human read");
	}
}
