package com.lsmore.patterns.builder;

public class CarStore {

	private CarBuilder carBuilder;
	
	public void setCarBuilder(CarBuilder builder) {
		this.carBuilder = builder;
	}
	
	public Car getCar() {
		return carBuilder.getCar();
	}
	
	public CarBuilder getCarBuilder() {
		return this.carBuilder;
	}
	
	public void startToBuildCar() {
		this.carBuilder.createNewCar();
		this.carBuilder.buildBrand();
		this.carBuilder.buildColor();
		this.carBuilder.buildPrice();
	}
}
