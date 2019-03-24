package com.wjc.Factory.func;

public class Test {

	public static void main(String[] args) {
		ElephantFactory elephantFactory = new ElephantFactory();
		System.out.println(elephantFactory.getAnimal().eat());
		
		LeopardFactory leopardFactory = new LeopardFactory();
		System.out.println(leopardFactory.getAnimal().eat());
		
	}
	
}
