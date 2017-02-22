package jalc.everydaythings.bottle;

import jalc.everydaythings.liquid.Water;

public class WaterBottle {
	private double capacity;
	private Water water;

	private WaterBottle(){
		this.capacity = 0;
		this.water = null;
	}

	public WaterBottle(double capacity, Water water) {
		this.capacity = capacity;
		this.water = water;
	}

	public double getCapacity() {
		return capacity;
	}

	public Water getWater() {
		return water;
	}
}
