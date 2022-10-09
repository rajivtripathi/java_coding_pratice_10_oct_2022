package roughWork2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		Map<String , String> map = new HashMap();		
		map.put("name", "rajiv");
		map.put("address", "Sec75");
		map.put("salary", "100");
		map.put("area", "golf avenue");
		
		Set<Entry<String, String>> set=map.entrySet();
		Set<String> set2=map.keySet();
		
		for(Entry<String, String> value: set) {			
			System.out.println(" Key is: "+value.getKey()+" Value is : "+value.getValue());	
			
		}		
		
		System.out.println("==============");		
		for(String value2: set2) {			
			System.out.println(" Key is: "+value2);	
			System.out.println(" Value is: "+map.get(value2));
		
		}
		
		}


}
	
