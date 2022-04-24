package com.String;

import java.util.HashMap;

public class Palindrom {


		public static void main(String[] args) {
			// TODO Auto-generated method stub		
			
			HashMap map = new HashMap();
			String str="ABCACB";			
			System.out.println(" Is palindrome: "+ isPalindrome(str));		
			
		}
		
		public static Boolean isPalindrome(String str) {
		char c[] =str.toCharArray();
		int start=0;
		int end =str.length()-1;
		
			while(str.charAt(start)==str.charAt(end) && start<c.length-1 && end>0) {		
				start++;
				end--;
			}	
			
			if(start==end)
			System.out.println(start);
			System.out.println(end);
			String str1=str.substring(start, end);
			str1.length();
			
			if(str1.length()==str.length()) {				
				return true;
			}			
			
			return false;
		}


}
