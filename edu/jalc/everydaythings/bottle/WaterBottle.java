package jalc.everydaythings.bottle;

import jalc.everydaythings.liquid.Water;

public class WaterBottle extends Bottle {
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
		return this.getCapacity() + " oz" + this.getWater();
	}
}
