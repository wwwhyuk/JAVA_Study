package InterfaceTest;

public abstract class Calculator implements Calc{

	@Override
	public int plu(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	@Override
	public int min(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}	
}
