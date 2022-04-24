package CodingPractive;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a ={ 10,6,8,14,30,16};
		
		int temp=0; int j=0;
		for (int i = 1; i < a.length; i++) {			
			i=j;
			
			while(j>0 && a[j-1]>a[j]) {				
				temp=a[j];
				j=j-1;
			}
			
				
			
		}
		
		
		
		

	}

}
