package com.String;

public class FabinacciSeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// a b k // a+b=k		
		int a=1,b=1,k=0;
		System.out.print(" 0 1 1 ");
		while(k<50) {	
			k=a+b; //2
			System.out.print(k); //2
			System.out.print(" ");	
			a=b;//1
			b=k;	//2
		}
				
			}
	}


