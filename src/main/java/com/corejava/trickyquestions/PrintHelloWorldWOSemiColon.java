package com.corejava.trickyquestions;

public class PrintHelloWorldWOSemiColon {
	public static void main(String[] args) {
		//1
		if(System.out.printf("Hello World" + "\n") == null){
			
		}
		//2
		if(System.out.append("Hello World" + "\n") == null) {
			
		}
		//3
		if(System.out.printf("Hello World" + "\n").equals(null)) {
			
		}
	}
}
