package com.wjc.Factory.func;

import com.wjc.Factory.Animal;
import com.wjc.Factory.Elephant;

public class ElephantFactory implements Factory {

	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return new Elephant();
	}

}
