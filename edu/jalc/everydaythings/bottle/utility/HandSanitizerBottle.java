package edu.jalc.everydaythings.bottle.utility;

import edu.jalc.everydaythings.bottle.Bottle;
import edu.jalc.everydaythings.bottle.Pourable;
import edu.jalc.everydaythings.liquid.Liquid;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

public class HandSanitizerBottle extends Bottle implements Pourable {

	private Pourable pourable;

	public HandSanitizerBottle(double capacity, Liquid liquid){
		super(capacity, liquid);
		this.pourable = null;
	}

	public HandSanitizerBottle(double capacity, Liquid liquid, Pourable pourable){
		super(capacity, liquid);
		this.pourable = pourable;
	}

	public void pour(){
		if(this.pourable == null){
			System.out.println("I am not a pourable handsanitizer");
			return;
		}
		pourable.pour();
	}

	public HandSanitizerBottle(double capacity, HandSanitizer handSanitizer){
		super(capacity, handSanitizer);
	}


}
