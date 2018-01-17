package com.lsmore.patterns.builder;

/**
 * abstract builder
 * @author Simon_Li1
 *
 */
public abstract class CarBuilder {
	
	protected Car car;
	
	public Car getCar() {
		return this.car;
	}
	
	public void createNewCar() {
		car = new Car();
	}
	
	public abstract void buildBrand();
	public abstract void buildColor();
	public abstract void buildPrice();

}
