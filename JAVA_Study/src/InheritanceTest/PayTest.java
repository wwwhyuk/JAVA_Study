package InheritanceTest;

public class PayTest {

	public static void main(String[] args) {
		VIPCustomer vip1 = new VIPCustomer("이주혁", 1001);
		vip1.bonus = 1000;
		System.out.println(vip1.getPrice(1000));
		vip1.getCustomerInfo();
		
		Customer c1 = new Customer("리주혁", 1002);
		c1.bonus = 1000;
		System.out.println(c1.getPrice(1000));
		c1.getCustomerInfo();
	}

}
