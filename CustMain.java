package pro8;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustMain {
public static void main(String[] args) throws FileNotFoundException,IOException {
	Customer customer=new Customer();
	customer.accept();
	ObjectOutputStream stream=
			new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("C:\\Deloitte\\Batch\\doc.txt"))));
	
	stream.writeObject(customer);
	stream.close();
	System.out.println("Data Stored");
}
}
