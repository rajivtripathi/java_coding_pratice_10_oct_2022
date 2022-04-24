package com.String;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="RAJIV";
		String s2="ARIJV";		
		
		if(IsAnagram(s1,s2)) {			
			System.out.println(" both strings are anagram ");
		}
		
		else {			
			System.out.println(" both strings are not anagram ");			
		}
	

	}
	
	
	public static boolean IsAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {			
			return false;
		}
		
		char [] s1array=s1.toCharArray();
		char [] s2array=s2.toCharArray();
		
		Arrays.sort(s1array);
		Arrays.sort(s2array);		
		
		return Arrays.equals(s1array, s2array);
		
	}

}
