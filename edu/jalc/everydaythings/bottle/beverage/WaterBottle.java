package edu.jalc.everydaythings.bottle.beverage;

import edu.jalc.everydaythings.bottle.Bottle;
import edu.jalc.everydaythings.liquid.beverage.Water;

public class WaterBottle extends BeverageBottle {
	private Water water;

	private WaterBottle(){
		super(0);
		this.water = null;
	}

	public WaterBottle(double capacity, Water water) {
		super(capacity);
		this.water = water;
	}

	public Water getWater() {
		return water;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getWater();
	}
}
