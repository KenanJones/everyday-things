package edu.jalc.everydaythings.bottle.beverage;

import edu.jalc.everydaythings.liquid.beverage.Soda;

public class SodaBottle extends BeverageBottle {

	private SodaBottle() {
		super(0, null);
	}

	public SodaBottle(double capacity, Soda soda) {
		super(capacity, soda);
	}

	public Soda getSoda() {
		return (Soda) this.getLiquid();
	}

}
