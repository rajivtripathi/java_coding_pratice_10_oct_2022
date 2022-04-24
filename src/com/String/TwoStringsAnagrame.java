package com.String;

public class TwoStringsAnagrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String str1="BFFGA";
		String str2="AFGFB";		
		System.out.println(isStringsAnagram(str1,str2));
	}
	
	public static Boolean isStringsAnagram(String str1, String str2) {		
		String str="";	
		for (int i = 0; i < str1.length(); i++) {			
			for (int j = 0; j < str2.length(); j++) {				
				if(str1.charAt(i)==str2.charAt(j)) {					
					str=str+str1.charAt(i);					
					break;
					}				
			}			
		}		
		
		if(str.equals(str1) || str.equals(str2)) {
			System.out.println(" string is ANAGRAME ");
			return true;
		}		
		return false;
	}

}
