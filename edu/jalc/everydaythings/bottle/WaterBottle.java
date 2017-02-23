package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Water;

public class WaterBottle extends Bottle {

	private WaterBottle(){
		super(0, null);
	}

	public WaterBottle(double capacity, Water water) {
		super(capacity, water);
	}

	public Water getWater() {
		return (Water) this.getLiquid();
	}

}
