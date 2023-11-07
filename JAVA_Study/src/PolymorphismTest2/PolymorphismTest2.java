package PolymorphismTest2;

import java.util.ArrayList;

public class PolymorphismTest2 {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer("a");
		Customer customer2 = new Customer("b");
		Customer customer3 = new Customer("c");
		Customer customer4 = new Gold("d");
		Customer customer5 = new Gold("e");
		Customer customer6 = new Gold("f");
		Customer customer7 = new Gold("g");
		Customer customer8 = new Vip("h");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		customerList.add(customer6);
		customerList.add(customer7);
		customerList.add(customer8);
		
		for(Customer c : customerList) {
			int price = 1000;
			c.calcPrice(price);
			c.showInfo();
		}
	}

}
