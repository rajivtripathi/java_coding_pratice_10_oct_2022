package com.String;

public class ReverseString {

	public static void main(String[] args) {	
		
	String str ="RAJAR";	
	System.out.println(isPalindrome(str));
		

	}
	
	
	public static Boolean isPalindrome(String str) {
		
		String rev ="";
		
		for (int i = str.length()-1; i>=0; i--) {		
			rev=rev+str.charAt(i);	
			// v+i+j+a+r
			
		}	
			System.out.println(rev);
			if(rev.equals(str)) {				
				System.out.println(" string is Palindrome: " + str);
				return true;
			}
		return false;
	}

}
