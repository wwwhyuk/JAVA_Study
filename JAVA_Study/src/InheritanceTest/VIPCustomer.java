package InheritanceTest;

public class VIPCustomer extends Customer {
	double salesRatio;

	public VIPCustomer(String cname, int cnum) {
		super("", 0);
		this.cname = cname;
		this.cnum = cnum;
		bonusRatio = 0.7;
		salesRatio = 0.2;
	}

	@Override
	public int getPrice(int price) {
		bonus += bonus*bonusRatio;
		return price - (int)(price*salesRatio);
	}

	@Override
	public void getCustomerInfo() {
		System.out.println(bonus);
	}
}
