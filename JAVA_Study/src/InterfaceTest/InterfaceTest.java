package InterfaceTest;

public class InterfaceTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		
		//일반적인 형변환과 같은 논리로 하위 클래스에선 사용 불가 calc.info();
		
		int num1 = 10;
		int num2 = 2;
		
		int a = calc.plu(num1, num2);
		int b = calc.min(num1, num2);
		int c = calc.mul(num1, num2);
		int d = calc.div(num1, num2);
		System.out.println(a + " " + b + " " + c + " " + d);
	}

}
