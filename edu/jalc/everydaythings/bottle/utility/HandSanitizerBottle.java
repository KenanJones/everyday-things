package edu.jalc.everydaythings.bottle.utility;

import edu.jalc.everydaythings.bottle.Bottle;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

public class HandSanitizerBottle extends Bottle {

	private HandSanitizer handSanitizer;

	private HandSanitizerBottle(){
		super(0);
		this.handSanitizer = null;
	}

	public HandSanitizerBottle(double capacity, HandSanitizer handSanitizer){
		super(capacity);
		this.handSanitizer = handSanitizer;
	}

	public HandSanitizer getHandSanitizer(){
		return this.handSanitizer;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getHandSanitizer();
	}
}
