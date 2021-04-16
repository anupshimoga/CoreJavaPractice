package com.corejava.trickyquestions;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
	findPrimeNumbers(2000);	
}
	public static void findPrimeNumbers(int lastNum) {
		for (int i = 2; i <= lastNum; i++) {
			int flag = 1;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} 
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}
	}
}

