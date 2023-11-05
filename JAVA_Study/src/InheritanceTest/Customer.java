package InheritanceTest;

public class Customer {
	protected String cname;
	protected int cnum;
	int bonus;
	double bonusRatio;
	
	
	//고객 생성
	public Customer(String cname, int cnum) {
		this.cname = cname;
		this.cnum = cnum;
		bonusRatio = 0.1;
		System.out.println("부모메소드입니다.");
	}

	//고객 등급별 가격 출력
	public int getPrice(int price) {
		bonus += bonus*bonusRatio;
		return price;
	}
	
	public void getCustomerInfo() {
		System.out.println(bonus);
	}
}
