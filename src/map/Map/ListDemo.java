package map.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("rajiv");
		list.add("ram");
		list.add("zam");
		list.add("Amy");		
		list.add(1,"babu");		
		System.out.println(list);		
	   list.set(0, "suresh");
	   list.indexOf("hello");	   
	   System.out.println(list.indexOf("hello"));
	   System.out.println(list);
	   
		List<String> list2 = new ArrayList();
		list2.add("zanana");
		list2.add("banana");
		list2.add("yanana");
		list2.add("apple");		
		list2.add("carrot");
		
		
		
		list.addAll(list2);
		 System.out.println(list);
		 
		 Map map=new HashMap();
		 map.put(1, "amy");
		 map.put(2, "baby");
		 
		
		 
		
		Iterator it=list.iterator();		
		while(it.hasNext()) {			
			System.out.println("===value==="+it.next());
		}
	}

}
