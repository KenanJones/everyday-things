package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Soda;

public class SodaBottle extends Bottle {

	private Soda soda;

	private SodaBottle() {
		super(0);
		this.soda = null;
	}

	public SodaBottle(double capacity, Soda soda) {
		super(capacity);
		this.soda = soda;
	}


	public Soda getSoda() {
		return soda;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getSoda();
	}

}
