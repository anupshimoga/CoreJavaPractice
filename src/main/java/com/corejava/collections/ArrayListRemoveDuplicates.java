package com.corejava.collections;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListRemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 78, 8, 9));

		// 1st method
		LinkedHashSet<Integer> dupRemoveList = new LinkedHashSet<Integer>(numberList);
		ArrayList<Integer> numbeList = new ArrayList<Integer>(dupRemoveList);
		System.out.println(numbeList);

		//2nd method
		ArrayList<Integer> numberList2 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 78, 8, 9));
		List<Integer> remDup = numberList2.stream().distinct().collect(Collectors.toList());
		System.out.println(remDup);
	}
}
