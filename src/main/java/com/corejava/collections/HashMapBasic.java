package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasic {
	public static void main(String[] args) {
		HashMap<Integer, String> empName = new HashMap<Integer, String>();
		empName.put(1, "Anup");
		empName.put(1, "Banu");
		empName.put(null, "Krazzzzy");
		empName.put(2, "Mayya");
		empName.put(3, "BaluPratap");
		
		//keyset
		Iterator<Integer> itrate = empName.keySet().iterator();
		while(itrate.hasNext()) {
			Integer nxt = itrate.next();
			String val = empName.get(nxt); 
			System.out.println("The key is " + nxt + " The value is "+ val);
		}
		
		//entryset
		Iterator<Entry<Integer, String>> itrator1 = empName.entrySet().iterator();
		while(itrator1.hasNext()) {
			Entry<Integer, String> nxt1 = itrator1.next();
			Integer ky = nxt1.getKey();
			String vl= nxt1.getValue();
			System.out.println("The key is " + ky + " The value is "+ vl);
		}
		empName.forEach((k,v) -> System.out.println("The key is " + k + " The value is "+ v));
	}
	
}
