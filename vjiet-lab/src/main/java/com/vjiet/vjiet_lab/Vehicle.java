package com.vjiet.vjiet_lab;


	
	public class Vehicle {

	    private final int maxFuel;
	    public int remainingFuel;

	    public Vehicle(final int maxFuel) {
	        this.maxFuel = maxFuel;
	        remainingFuel = maxFuel;
	    }

	    // this is not a car's responsibility.
	    public void reFuel(){
	        remainingFuel = maxFuel;
	    }

	    public int getMaxFuel() {
	        return maxFuel;
	    }

	    public int getRemainingFuel() {
	        return remainingFuel;
	    }

	    public void setRemainingFuel(final int remainingFuel) {
	        this.remainingFuel = remainingFuel;
	    }

	    public void accelerate() {
	        remainingFuel--;
	        System.out.println(remainingFuel)
;	    }
	}


