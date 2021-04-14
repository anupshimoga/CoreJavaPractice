package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Amnup","Absysy","Tom", "Ram"));
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList("Amnup","Rom","Tom", "Ram"));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList("Amnup","Ram","Absysy","Tom" ));
		
		Collections.sort(nameList);
		Collections.sort(nameList2);
		System.out.println(nameList.equals(nameList2));
		System.out.println(nameList.equals(nameList1));
		
		//find all additional elements
		nameList1.removeAll(nameList);
		System.out.println(nameList1);
		
		//find out missing elements
		nameList.removeAll(nameList1);
		System.out.println(nameList);
		
		//find out common list
		nameList2.retainAll(nameList);
		System.out.println(nameList2);
		
		nameList1.retainAll(nameList);
		System.out.println(nameList1);
	}
}
