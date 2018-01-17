package com.lsmore.patterns.builder;

public class CustomerTest {
	
	public static void main(String[] args) {
		CarStore carStore = new CarStore();
		carStore.setCarBuilder(new BenzBuilder());
		carStore.startToBuildCar();
		
		Car car = carStore.getCar();
		System.out.print("Car is ready: " + car.getBrand());
	
	}

}
