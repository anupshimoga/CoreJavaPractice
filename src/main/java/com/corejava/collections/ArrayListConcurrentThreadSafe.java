package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConcurrentThreadSafe {
	public static void main(String[] args) {
		List<String> arr = Collections.synchronizedList(new ArrayList<String>());
		
		arr.add("ABC");
		arr.add("123");
		
		synchronized (arr) {
			Iterator<String> it = arr.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		CopyOnWriteArrayList<String> arr1 = new CopyOnWriteArrayList<String>(Arrays.asList("ADS","AFD"));
		
	}
}
