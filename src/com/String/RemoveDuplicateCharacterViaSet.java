package com.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateCharacterViaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "RRAAAAJIIV";
		char[] c = s1.toCharArray();

		Set set = new HashSet();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < c.length; i++) {
			if(set.add(c[i])) {				
				set.add(c[i]);
			}

	}		
		System.out.println(set);

	}
	
}
