package com.String;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 459;
		int lastDigit=0;
		int reverse=0;
		
		while(num>0) {			
			lastDigit=num%10;//9 //5 //4
			reverse = (reverse*10) + lastDigit;//9// 90+5=95//95*10+4=954
			num=num/10;			//45//4
		}		
		System.out.println(reverse);

	}

}
