package AbstractTest;

public abstract class Notebook extends Computer {
	public abstract void display();
	
	@Override
	public void typing() {
		System.out.println("this is notebook typing");
	}
}
