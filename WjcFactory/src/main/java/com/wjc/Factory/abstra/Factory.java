package com.wjc.Factory.abstra;

import com.wjc.Factory.Animal;
import com.wjc.Factory.func.LeopardFactory;

public class Factory extends AbstarctFactory {

	private LeopardFactory defaultFactory = new LeopardFactory();
	
	@Override
	protected Animal getAnimal() {
		// TODO Auto-generated method stub
		return defaultFactory.getAnimal();
	}

}
