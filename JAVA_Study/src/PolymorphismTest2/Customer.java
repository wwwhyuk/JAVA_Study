package PolymorphismTest2;

public class Customer {
	protected String name;
	protected String grade;
	
	int bonus = 1000;
	double bonusRatio;
	double discountRatio;
	
	public Customer(String name) {
		this.name = name;
		grade = "Silver";
		bonusRatio = 0.01;
		discountRatio = 0.1;
	}
	//silver
	public int calcPrice(int price) {
		bonus += price*bonusRatio;
		price = (int) (price-(price*discountRatio));
		return price;
	}
	
	public void showInfo() {
		System.out.println(" name : " + name + "\n grade : " + grade + "\n bonus : " + bonus + "\n");
	}
	
	public String getName() {
		return name;
	}
}
