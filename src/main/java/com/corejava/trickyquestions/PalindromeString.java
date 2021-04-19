package com.corejava.trickyquestions;

public class PalindromeString {
	public static void main(String[] args) {
		palindrome("rammar");
	}
	public static void palindrome(String name) {
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("The string is palindrome");
		}
		else {
		System.out.println("The string is not palindrome");
		}
	}
}
