package com.wjc.Factory.simple;

import com.wjc.Factory.Animal;
import com.wjc.Factory.Elephant;
import com.wjc.Factory.Leopard;

public class SimpleFactory {

	public Animal getAnimal(String name) {
		if ("Elephant".equals(name)) {
			return new Elephant();
		}else if ("Leopard".equals(name)) {
			return new Leopard();
		}else {
			return null;
		}		
	}
	
}
