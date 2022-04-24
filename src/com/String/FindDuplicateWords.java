package com.String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class FindDuplicateWords {

	// find duplicate words
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] names = { "hello", "hello", "rajiv", "rajiv", "hello", "good", "good", "unique" };

		for (String x : names) {
			if (!map.containsKey(x)) {
				map.put(x, 1);
			} else {
				map.put(x, map.get(x)+1);
			}
		}
		System.out.println(map);		
		Set<Entry<String, Integer>> value=map.entrySet();		
		for( Entry<String, Integer> y: value) {			
			if(y.getValue() >1) {				
				System.out.println(y.getKey());
			}
		}
	}

}
