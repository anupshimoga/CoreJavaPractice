package com.corejava.trickyquestions;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 1,1,2,3,5,8,13,21,....
		fib(10);
	}
	public static void fib(int count) {
		int fib = 0;
		int init1 = 1;
		for (int i = 1; i <= count; i++) {
			int sum = fib + init1;
			fib = init1;
			init1 = sum;
			System.out.println(fib);
		}
	}
}
