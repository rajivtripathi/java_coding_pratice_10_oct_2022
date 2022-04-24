package com.String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Rajiv is good boy";
		
		System.out.println(s1.replaceAll("\\s", ""));
		System.out.println(s1.replaceAll("/t", ""));
		System.out.println(s1.replaceAll(" ", ""));
		System.out.println(s1.replace(" ", ""));
		
	}

}
