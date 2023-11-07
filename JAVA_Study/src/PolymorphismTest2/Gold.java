package PolymorphismTest2;

public class Gold extends Customer{
	public Gold(String name) {
		super(name);
		grade = "Gold";
		bonusRatio = 0.03;
		discountRatio = 0.2;
	}
	
	@Override
	public int calcPrice(int price) {
		super.bonus += price*bonusRatio;
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
