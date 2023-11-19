package DiamondProblem;

public interface C extends A{
	public void c();
	
	default void print() {
		System.out.println("C");
	}
}
