package javaproj2;

public class customerMain {
	public static void main(String[] args) {
		Customer customer=new Customer(9561,"Shradha","kochi",97500);
		System.out.println(customer);
		customer.setBillAmount(12000);
		System.out.println(customer);
	}

}
