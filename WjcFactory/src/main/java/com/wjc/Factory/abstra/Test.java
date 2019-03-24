package com.wjc.Factory.abstra;

public class Test {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		System.out.println(factory.getAnimal("Elephant").eat());
		
		
	}
	
}
