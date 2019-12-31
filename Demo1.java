package javaproj2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo1 {
int num1,num2;
int res;
Scanner sc=new Scanner(System.in);
public void display() {
	try {
		System.out.println("Welcome");
		System.out.println("Enter first num:");
		num1=sc.nextInt();
		System.out.println("enter second num:");
		num2=sc.nextInt();
		res=num1/num2;
		System.out.println(res);
	} catch (InputMismatchException e) {
		// TODO Auto-generated catch block
		System.out.println("enterd alphabet");
	}catch(ArithmeticException e) {
		System.out.println("entered invalid num");
	}
	System.out.println("Bye");
}

public static void main(String[] args) {
System.out.println("in main");	
Demo1 d=new Demo1();
d.display();
}
}