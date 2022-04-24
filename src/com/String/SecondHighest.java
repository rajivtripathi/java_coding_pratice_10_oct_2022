package com.String;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = { 3,8,1,5,2,10,9};		
		int highest=0;
		int secondHighest=0;
		
		for (int i = 0; i < x.length; i++) {			
			if(x[i]>highest) {				
				secondHighest=highest; //3
				highest=x[i]; //3 8	
			}
			
			if(x[i]>secondHighest && x[i]<highest) {				
				secondHighest=x[i];					
			}
			
		}		
		System.out.println(" second highest "+secondHighest);	

	}

}
