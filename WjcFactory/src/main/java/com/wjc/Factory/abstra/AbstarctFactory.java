package com.wjc.Factory.abstra;

import com.wjc.Factory.Animal;
import com.wjc.Factory.func.ElephantFactory;
import com.wjc.Factory.func.LeopardFactory;

public abstract class AbstarctFactory {

	protected abstract Animal getAnimal();
	
	public Animal getAnimal(String name) {
		if ("Elephant".equals(name)) {
			return new ElephantFactory().getAnimal();
		}else if ("Leopard".equals(name)) {
			return new LeopardFactory().getAnimal();
		}else {
			return null;
		}		
	}
	
}
