package roughWork2;

import java.util.Arrays;

public class AnagrameStrings {

	public static void main(String[] args) {		
		
		String str1 ="hello";
		String str2 ="elloh";
		
		//isAnagram(str1,str2);		
		System.out.println(isAnagram(str1,str2));
		
	}
	
	public static Boolean isAnagram(String str1, String str2) {
		
		//String str1 ="helloj";
		//String str2 ="elloh";
         String str=null;	
         System.out.println(str1.length());
         System.out.println(str2.length());
		if(str1.length()!=str2.length()) {			
			System.out.println(" --lenghs are not equal---");
			return false;
		}
		
		for (int i = 0; i < str1.length(); i++) {			
			for (int j = 0; i < str2.length(); j++) {				
				if(str1.charAt(i)==str2.charAt(j)) {					
					str=str2.substring(0,j)+str2.substring(j+1, str2.length());	
					System.out.println("===str=="+str);
					//break;
				}		
				
			}			
		}
		
		if(str==null) {
			System.out.println(" Anagram string ");
			return true;
		}
		
		return true;
	}
}
