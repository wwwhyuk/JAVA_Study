package PolymorphismTest2;

public class Vip extends Customer{
	
	public Vip(String name) {
		super(name);
		grade = "VIP";
		bonusRatio = 0.1;
		discountRatio = 0.3;
	}
	
	@Override
	public int calcPrice(int price) {
		bonus += price*bonusRatio;
		price = (int) (price-(price*discountRatio));
		return price;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

}
