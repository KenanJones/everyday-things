package edu.jalc.everydaythings.bottle.utility;

import edu.jalc.everydaythings.bottle.Bottle;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

public class HandSanitizerBottle extends Bottle {


	private HandSanitizerBottle(){
		super(0, null);
	}

	public HandSanitizerBottle(double capacity, HandSanitizer handSanitizer){
		super(capacity, handSanitizer);
	}


}
