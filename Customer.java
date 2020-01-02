package pro8;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable,Comparable<Customer>{
public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		this.billAmount = billAmount;
	}
private int CustomerId;
private String CustomerName;
private String CustomerAddress;
private transient int billAmount;
public Customer() {
	
}
public void accept() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter customer id : "); CustomerId = scanner.nextInt();
	System.out.println("Enter customer name : "); CustomerName = scanner.next();
	System.out.println("Enter customer address : "); CustomerAddress = scanner.next();
	System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
}
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(String customerAddress) {
	CustomerAddress = customerAddress;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}
@Override
public String toString() {
	return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
			+ CustomerAddress + ", billAmount=" + billAmount + "]";
}
@Override
public int compareTo(Customer o) {
	if(this.getBillAmount()>o.getBillAmount())
	return 0;
	else
		return -1;
}

}
