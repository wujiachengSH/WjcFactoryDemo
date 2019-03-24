package com.wjc.Factory.func;


import com.wjc.Factory.Animal;
import com.wjc.Factory.Leopard;

public class LeopardFactory implements Factory {

	//来个单例工厂好了
	private static class  LeopardBean {
		private static final Leopard INSTANCE = new Leopard();
	} 
	
	
	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return LeopardBean.INSTANCE;
	}

}
