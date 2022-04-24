package com.String;

import java.util.Arrays;

public class RoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int num= 536;
      int rem=0;
      int sum=0;
      
      while(num>0) {    	  
    	  rem=num%10;// 6 3 5
    	  sum=sum+rem; //6+3= 9+5=14
    	  num=num/10;   //53 5  0     	  
      }
		
		System.out.println(sum);

	}

}
