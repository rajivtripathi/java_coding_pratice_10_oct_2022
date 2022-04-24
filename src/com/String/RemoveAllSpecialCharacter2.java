package com.String;

public class RemoveAllSpecialCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="RAJIV&&&s*%@@@";
		
		//s1.replaceAll(s1, "[A-Za-z0-9]");
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
		
		

	}

}
