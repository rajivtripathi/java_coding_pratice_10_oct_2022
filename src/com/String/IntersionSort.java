package com.String;

public class IntersionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int temp=0;
		int [] a = { 5,2,10,13,4,6 };
		 //{ 2,5,10,13,4,6 }
		//  2 5 10 13 4 6

		for(int i=1;i<a.length;i++) {
			//i=1,2,3
			int temp=a[i];//temp=2,10,13
			int j=i-1;	// j=0,1	
			while(j>=0 && a[j]>temp) {// a[1]=5
				//a[0]=5
				a[j+1]=a[j];//a[1]=5
				j--;
				// j=-1
			}			
			a[j+1]=temp;// a[0]=2, a[1]=10		
		}
		
	for(int x: a) {
		
		System.out.print(" ");
		System.out.print(x);
	}
		

}
	
}
