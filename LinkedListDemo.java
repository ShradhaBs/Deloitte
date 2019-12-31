package javaproj2;
import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("Shradha");
		names.add("Kavitha");
		names.add("Gayathri");
		names.add("Gayathri");
		System.out.println(names);
		names.add(2,"Reddy");
		System.out.println(names);
		names.remove("Gayathri");
		System.out.println(names);
		System.out.println(names.isEmpty());
		
		System.out.println(names.size());
		System.out.println(names);
		
	}
}
