package CodingPractive;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurenceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rajivtripathi";
		char[] c = s1.toCharArray();

		Map<Character, Integer> map = new HashMap();
		for (char c1 : c) {

			if(!map.containsKey(c1)){				
				map.put(c1, 1);
			} else {
				map.put(c1, map.get(c1) + 1);
			}
		}
		
		System.out.println(map);

	}

}
