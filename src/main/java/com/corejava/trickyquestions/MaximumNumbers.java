package com.corejava.trickyquestions;

public class MaximumNumbers {
	public static void main(String[] args) {
		int a = 1;
		int b = 2100;
		int c = 70;
		int d = 10;
		if (a > b && a > c && a > d) {
			System.out.println("a is greater");
		} else if (b > c && b > d) {
			System.out.println("b is greater");
		} else if (c > d) {
			System.out.println("c is greater");
		} else {
			System.out.println("d is greater");
		}
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Chrome ");
			break;
		case "opera":
			System.out.println("Opera ");
			break;
		default:
			System.out.println("Choose the right browser");
			break;
		}
		
	}

}
