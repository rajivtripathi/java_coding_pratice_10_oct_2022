package map.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list2 = new ArrayList();
		list2.add("zanana");
		list2.add("banana");
		list2.add("yanana");
		list2.add("apple");		
		list2.add("carrot");
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(8);
		list.add(5);
		list.add(15);
		list.add(12);
		list.add(5);
		
		Collections.max(list);
		System.out.println(Collections.max(list));		
		Collections.sort(list2);
		Collections.max(list2);
		System.out.println(Collections.max(list2));

	}

}
