package pro8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<String,Double> hm=new HashMap<String,Double>();
	hm.put("John Doe", new Double(3434.34));
	hm.put("Tom Smith", new Double(123.22));
	hm.put("Jane Baker", new Double(1378.00));
	Set set=hm.entrySet();
	Iterator i=set.iterator();
	
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next();
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
		
	}
	System.out.println();
	double balance=((Double)hm.get("John Doe")).doubleValue();
	hm.put("John Doe", new Double(balance)+1000);
	//System.out.println();
	Iterator j=set.iterator();
	while(j.hasNext()) {
		Map.Entry me=(Map.Entry)j.next();
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
	}
}
}
