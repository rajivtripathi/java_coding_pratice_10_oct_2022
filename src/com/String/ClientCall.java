package com.String;

public class ClientCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonDemo demo=SingletonDemo.getInstance("hello");
		System.out.println(demo.name);
		System.out.println(demo.hashCode());
		SingletonDemo demo1=SingletonDemo.getInstance("rajiv");
		System.out.println(demo1.hashCode());

	}

}
