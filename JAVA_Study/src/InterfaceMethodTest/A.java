package InterfaceMethodTest;

public interface A {
	public void a();
	
	default void hello() {
		System.out.println("hello");
		hello2();
	}
	
	static int cal(int arr[]) {
		int total = 0;
		
		for(int a : arr) {
			total+=a;
		}
		return total;
	}
	
	private void hello2() {
		System.out.println("hello2");
	}
}
