package javaproj2;

public class Demo3 {
	public void display1() throws Exception{
		System.out.println("welcome in display1");
		Thread.sleep(1000);
		System.out.println("bye");
	}
public void display2() throws InterruptedException {
	System.out.println("welcome in display2");
	Thread.sleep(1000);
	System.out.println("bye");
}

public static void main(String[] args) throws Exception {
	System.out.println("main started");
	Demo3 d=new Demo3();
	d.display1();
	d.display2();
	System.out.println("main ended");
}
}
