package StaticTest;

public class Company {
	static int num = 1000;
	String name;

	public void createMan(String name) {
		this.name = name;
		num++;
	}
	
	public void manInfo() {
		System.out.println(name+"사원의 사번은 "+num+"번 입니다.");
	}
}
