package pro8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class CustomerMain {
	public static void main(String[] args) {
		
		List<Customer>allCustomers=new ArrayList<Customer>();
		Customer customer1=new Customer(1," Shradha", "Kerala", 20000);
		Customer customer2=new Customer(2, "Gayathri", "Pune", 3000);
		Customer customer3=new Customer(3, "Kavitha", "Assam", 30000);
		allCustomers.add(customer1);
		allCustomers.add(customer2);
		allCustomers.add(customer3);
		System.out.println(allCustomers);
		
		System.out.println("Enter choice 1)Name 2)Address 3)BillAmount");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==3) {
			Collections.sort(allCustomers);
			Iterator<Customer>i=allCustomers.iterator();
			while(i.hasNext()) {
			Customer customer=i.next();
			System.out.println(customer);
		
		}
		}
		if(choice==1) {
			Collections.sort(allCustomers,new NameComparator());
			Iterator<Customer>i=allCustomers.iterator();
			while(i.hasNext()) {
			Customer customer=i.next();
			System.out.println(customer);
		
			}
		}
		if(choice==2) {
			Collections.sort(allCustomers,new AddressComparator());
			Iterator<Customer>i=allCustomers.iterator();
			while(i.hasNext()) {
			Customer customer=i.next();
			System.out.println(customer);
		
			}
		}
			//instead of using separate class
	Collections.sort(allCustomers, new Comparator<Customer>() {
		public int compare(Customer o1,Customer o2) {
			if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)return 0;
			else return -1;
		}
	});	
	
	
	}
}
