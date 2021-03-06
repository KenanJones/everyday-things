package edu.jalc.everydaythings.bottle.utility;

import edu.jalc.everydaythings.bottle.Pourable;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

public class Driver {

	public static void main(String... args){
		HandSanitizerBottle handSanitizer = new HandSanitizerBottle(0, new HandSanitizer());
		handSanitizer.pour();

		Pourable pourable = new Pourable() {
			@Override
			public void pour() {
				System.out.println("yuck, you poured handsanitizer everywhere");
			}
		};

		HandSanitizerBottle pourableHandSanitizer = new HandSanitizerBottle(0, new HandSanitizer(), pourable);
		pourableHandSanitizer.pour();

		HandSanitizerBottle lambdaVersion = new HandSanitizerBottle(0,
						new HandSanitizer(),
						() -> System.out.println("lamda version - yeah"));
		lambdaVersion.pour();

	}
}
