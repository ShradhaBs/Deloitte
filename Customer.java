package javaproj2;

public class Customer {
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
private int billAmount;
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

}
