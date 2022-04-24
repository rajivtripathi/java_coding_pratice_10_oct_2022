package CodingPractive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		String s1 = "rajiv rajiv is is a goog good boy boy boy";

		String[] a = s1.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s2 : a) {			
			
			if (!map.containsKey(s2)) {
				map.put(s2, 1);
			} else {
				map.put(s2, map.get(s2) + 1);
			}

		}

		System.out.println(map);
		
	Set<Entry<String, Integer>> set= map.entrySet();
	
for(Entry<String, Integer> set1: set ) {
	
	System.out.println(" key is: "+set1.getKey());
	System.out.println(" value is: "+set1.getValue());
	
	if(set1.getValue()>1) {
				
		
	}
}
	
	
		
		

	}

}
