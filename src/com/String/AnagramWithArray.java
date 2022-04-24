package com.String;

public class AnagramWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String s1="RAJIV";
		String s2="ARIVJ";		
		if(isAnagram(s1, s2)) {
			System.out.println(" Anagram ");			
		}		
		else {
			System.out.println(" Non Anagram ");
		}		
	}
		 static boolean isAnagram(String s1, String s2) {		
		
			 if(s1.length()!=s2.length()) {
			 return false;
		 }
		 //String s1="RAJIV";
		//String s2="ARIVJ";		 
		for (int i = 0; i < s1.length(); i++) {			
			char c=s1.charAt(i);			
			int index=s2.indexOf(c);
			
			if(index==-1) {
				return false;
			}			
			if(index!=-1) {				
				s2=s2.substring(0,index)+s2.substring(index+1,s2.length());	
				System.out.println(s2);
			}			
		}		
		return true;
	}

}
