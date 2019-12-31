package javaproj2;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class NewYearParty{
	int eligibleAge=16;
	Scanner sc=new Scanner(System.in);
	int age;
	public void enterClub() throws InvalidAgeException{
		System.out.println("enter your age");
		age=sc.nextInt();
		if(age<eligibleAge)
		{
		throw new InvalidAgeException("Under Age");	
		}
		else {
			System.out.println("Welcome");
		}
		}
	
}
public class Demo4 {
public static void main(String[] args) {
	NewYearParty n=new NewYearParty();
	try {
		n.enterClub();
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("enjoy");
}
}
