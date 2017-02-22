package jalc.everydaythings.bottle;

import jalc.everydaythings.liquid.Beer;

public class BeerBottle {

	private double capacity;
	private Beer beer;

	private BeerBottle(){
		this.capacity = 0;
		this.beer = null;
	}

	public BeerBottle(double capacity, Beer beer){
		this.capacity = capacity;
		this.beer = beer;
	}

	public double getCapacity(){
		return this.capacity;
	}

	public Beer getBeer(){
		return this.beer;
	}
}
