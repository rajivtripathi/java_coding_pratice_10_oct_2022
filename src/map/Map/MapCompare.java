package map.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map1 = new HashMap<>();		
		Map<Integer,String> map2 = new HashMap<>();
		Map<Integer,String> map3 = new HashMap<>();
		
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "four");
		map1.put(5, "five");
		
		map2.put(2, "two");
		map2.put(3, "three");
		map2.put(4, "four");
		map2.put(5, "five");
		
		
		map3.put(3, "two");
		map3.put(4, "three");
		map3.put(5, "four");
		map3.put(2, "five");		
		
		System.out.println(map1.equals(map2));		
		System.out.println(map1.keySet().equals(map3.keySet()));		
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
		
		
		
		
		
		

	}

}
