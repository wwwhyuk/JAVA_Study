package DiamondProblem;

public interface B extends A{
	public void b();
	
	default void print() {
		System.out.println("B");
	}
}
