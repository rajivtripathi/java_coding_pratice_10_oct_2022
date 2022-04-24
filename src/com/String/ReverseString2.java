package com.String;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Rajiv is good";
		
		String [] s2=s1.split(" ");
		
		for (int i = 0; i < s2.length; i++) {			
			String str=s2[i].toString();			
			System.out.print(reverseString(str));
			System.out.print(" ");
		}


	}
	
	public static String reverseString(String s1) {

		String str="";		
		for (int i = s1.length()-1; i>=0; i--) {			
			str=str+s1.charAt(i);			
		}		
		return str;
	}

}
