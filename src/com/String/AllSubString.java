package com.String;

import java.util.ArrayList;
import java.util.List;

public class AllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="ABCD";
		System.out.println(getTotalSubstring(str));
	}
	
	public static List<String> getTotalSubstring(String str) {
	
		List<String> list = new ArrayList<String>();		
		 int count=0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = i+1; j<=str.length(); j++) {
					String str1 = str.substring(i, j);
					System.out.println(str1);
					list.add(str1);					
					count++;
				}

			}
			
			System.out.println(count);
			System.out.println(list);
			return list;
	}
	


}
