package com.String;

public class SingletonDemo {

	private static SingletonDemo singleton;	
	public String name;

	private SingletonDemo(String name) {		
		this.name=name;
		
	}

	public static SingletonDemo getInstance(String name) {

		if (singleton == null) {
			System.out.println(" inside null ");
			singleton = new SingletonDemo(name);			
		}
		
		return singleton;
	}

}
