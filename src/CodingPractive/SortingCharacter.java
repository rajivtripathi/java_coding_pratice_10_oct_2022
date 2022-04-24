package CodingPractive;

public class SortingCharacter {
	
	

	public static void main(String[] args) {
		String str = "java";
		char[] a = str.toCharArray();		
		char temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {				
				System.out.println("before: "+a[i]+" "+a[j] + " string: "+new String(a));
				if(a[i]>a[j]) {					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}				
				System.out.println("after: "+a[i]+" "+a[j] +" string: "+new String(a));
			}

		}

	}

}
