package CodingPractive;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,20,30,40,10,20};
		List list = new ArrayList();
		
		for (int i = 0; i < a.length; i++) {			
			for (int j = i+1; j < a.length; j++) {				
				
				if(a[i]==a[j]) {
					
				list.add(a[i]);
					
				}
				
			}
			
		}
		
		System.out.println(list);
		
		
	}
	
}
