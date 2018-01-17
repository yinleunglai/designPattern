package com.lsmore.patterns.builder;

public class BYDBuilder extends CarBuilder {

	@Override
	public void buildBrand() {
		// TODO Auto-generated method stub
		car.setBrand("BYD");
	}

	@Override
	public void buildColor() {
		// TODO Auto-generated method stub
		car.setColor("White");
	}

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		car.setPrice(170000);
	}

}
