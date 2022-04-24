package com.String;

public class SumOfIntegerDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=456; //15
		int rem=0;
		int sum=0;
		
		while(num>0) {		
			
			rem=num%10;//6
			num=num/10; //45
			sum=rem+num;			
			
		}
				
		System.out.println(sum);		
		

	}

}
