package map.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String>map=new HashMap();		
		map.put("name", "rajiv");
		map.put("city", "Dehradun");
		map.put("state", "UK");
		
		Set<String> keys=map.keySet();		
		for(String x: keys) {			
			System.out.println(x);
			System.out.println(map.get(x));
		}
		System.out.println("====================");
		
		Set<Entry<String,String>> entyset=map.entrySet();
		
		for(Entry<String,String> entryvalue: entyset ) {			
			System.out.println("----for loop---entryvalue----"+entryvalue.getKey());
			System.out.println("---for loop----entryvalue----"+entryvalue.getValue());
		}
		System.out.println("====================");
		
		Iterator<Entry<String, String>> it=map.entrySet().iterator();		
		while(it.hasNext()) {				
			System.out.println("----iterator--entryset--"+it.next());
		}


	}

}
