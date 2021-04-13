package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThreadSafe {
	public static void main(String[] args) {
		
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("Tom");
		names.add("Ram");
		names.add("Raheem");
		System.out.println(names);
		
		//If iterating then synchroniozation needs to be explicitly called
		synchronized (names) {
			Iterator<String> it = names.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		CopyOnWriteArrayList<String> nameList = new CopyOnWriteArrayList<String>(Arrays.asList("Anup","Viraj","Raj"));
		System.out.println(nameList);
	}
}
