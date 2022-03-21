package com.training.cg.dp;

public class NonVegRestaurant implements Hotel{
	
	@Override
	public Menu getMenus() {
		
		NonVegMenu nvm = new NonVegMenu();
		return nvm;
	}

}
