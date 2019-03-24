package com.wjc.Factory.simple;

import com.wjc.Factory.Animal;

public class Test {

	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		Animal animal = simpleFactory.getAnimal("Leopard");
		System.out.println(animal.eat());
		
	}
}
