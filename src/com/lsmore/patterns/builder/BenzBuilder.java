package com.lsmore.patterns.builder;

public class BenzBuilder extends CarBuilder {

	@Override
	public void buildBrand() {
		// TODO Auto-generated method stub
		car.setBrand("Benz");
	}

	@Override
	public void buildColor() {
		// TODO Auto-generated method stub
		car.setColor("Red");
	}

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		car.setPrice(2000000);
	}

}
