package DiamondProblem;

public interface A {
	public void a();
	
	default void print() {
		System.out.println("A");
	}
}
