package com.vjiet.vjiet_lab;

public class FuelPump {

	public void reFuel(final Vehicle vehicle) {
		final int remainingFuel = vehicle.getRemainingFuel();
		final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
		vehicle.setRemainingFuel(remainingFuel + additionalFuel);
		
	}

	public void show() {
		System.out.println("fuelpump");
		
	}

}
