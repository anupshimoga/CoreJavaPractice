package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(300);
		System.out.println(ar); 	
		for(Integer array1 : ar) {
			System.out.println(array1);
		}
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(345);
		ar1.add(500);
		
		ar.addAll(ar1);
		System.out.println(ar);
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(ar2.removeIf(num-> num%2 == 0));
		System.out.println(ar2);
		System.out.println(ar2.removeIf(ele-> ele%3 == 0));
		System.out.println(ar2);
	} 
}
