package com.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PalindromMax {

	// Get Total substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		HashMap map = new HashMap();		
		
		String str ="ABCBA";
		List<String> list =getTotalSubstring(str);
		//System.out.println(getTotalSubstring(str));
		for (int i = 0; i < list.size(); i++) {				
			if(isPalindrome(list.get(i))) {
				map.put(list.get(i), list.get(i).length());
			}
		}
		
		System.out.println(map);		
		
	}
	
public static Boolean isPalindrome(String str) {
		
		String rev ="";		
		for (int i = str.length()-1; i>=0; i--) {		
			rev=rev+str.charAt(i);				
		}	
			//System.out.println(rev);
			if(rev.equals(str)) {				
				//System.out.println(" string is Palindrome: " + str);
				return true;
			}
		return false;
	}

public static List<String> getTotalSubstring(String str) {
	
	List<String> list = new ArrayList<String>();		
	 int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j<=str.length(); j++) {
				String str1 = str.substring(i, j);
				//System.out.println(str1);
				list.add(str1);					
				count++;
			}
		}		
		return list;
}


}
