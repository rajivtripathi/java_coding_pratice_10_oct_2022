package com.String;

import java.util.HashMap;
import java.util.Map;

public class AnagrameViaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		map1.put("name", "rajiv");
		map1.put("address", "Noida");
		map1.put("Sector", "20");
		
		map2.put("Sector", "20");
		map2.put("address", "Noida");
		map2.put("name", "rajiv");			
		
		System.out.println(map1.equals(map2));

	}

}
