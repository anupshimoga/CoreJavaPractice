package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		//1 Compare by equal method key-value
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		 
		//2. Compare key set
		System.out.println(map1.keySet().equals((map2.keySet())));
		System.out.println(map1.keySet().equals((map3.keySet())));
		
		//3. find out extra keys 
		HashSet<Integer> extraKeys = new HashSet<Integer>(map1.keySet());
		HashSet<Integer> extraKeys1 = new HashSet<Integer>(map2.keySet());
		
		extraKeys.addAll(map3.keySet());
		System.out.println(extraKeys);
		
		extraKeys.removeAll(map1.keySet());
		System.out.println(extraKeys);
		
		
		//4 . Compare maps by values
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		map5.put(4, "C");
		
		
		//duplicates are not allowed using ArrayList
		ArrayList<String> newValue = new ArrayList<String>(map4.values());
		ArrayList<String> newValue1 = new ArrayList<String>(map5.values());
		System.out.println(newValue.equals(newValue1));
		
		//duplicates are allowed using HashSet
		HashSet<String> newHashValue = new HashSet<String>(map4.values());
		HashSet<String> newHashValue1 = new HashSet<String>(map5.values());
		System.out.println(newHashValue.equals(newHashValue1));
		
		int[] i = {24,45,6,7};
		for(int j = 0; j<i.length; j++) {
		System.out.println(i[j]);
		
		ArrayList<Integer> arry1 = new ArrayList<Integer>(Arrays.asList(1));
		}
		}
}
