package InterfaceTest;

public class CompleteCalc extends Calculator{
	@Override
	public int mul(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}

	@Override
	public int div(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}
	
	public void info() {
		System.out.println("계산");
	}
}
