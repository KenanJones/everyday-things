package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.bottle.beverage.BeerBottle;
import edu.jalc.everydaythings.bottle.beverage.BeverageBottle;
import edu.jalc.everydaythings.bottle.beverage.SodaBottle;
import edu.jalc.everydaythings.bottle.utility.HandSanitizerBottle;
import edu.jalc.everydaythings.liquid.beverage.Beer;
import edu.jalc.everydaythings.liquid.beverage.Soda;
import edu.jalc.everydaythings.liquid.Water;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

import java.util.ArrayList;

public class Driver {
	public static void main(String... args) {

		// Yuk, we can drink hand sanitizer!
		ArrayList<Bottle> drinks = new ArrayList<>();
		drinks.add(new SodaBottle(20, new Soda()));
		drinks.add(new BeerBottle(16, new Beer()));
		drinks.add(new WaterBottle(20, new Water()));
		drinks.add(new HandSanitizerBottle(120, new HandSanitizer()));

		for (Bottle bottle : drinks) {
			System.out.println("You just drank a " + bottle);
		}

		System.out.println("\nLet's try that again");

		// Instead lets polymorph to a beveragebottle preventing non-beverages
		ArrayList<BeverageBottle> beverages = new ArrayList<>();

		beverages.add(new SodaBottle(20, new Soda()));
		beverages.add(new BeerBottle(16, new Beer()));

		// Will no longer work, but with extra credit, it can be turned back on.
		// beverages.add(new WaterBottle(20, new Water()));

		// notice how we can polymorph from beverage bottle to bottle?
		for (Bottle bottle : beverages) {
			System.out.println("You just drank a " + bottle);
		}

		// We now implemented the interfaces, lets polymorph to them
		SodaBottle sodaBottle = new SodaBottle(20, new Soda());
		Pourable pourable = sodaBottle;
		Fillable fillable = sodaBottle;

		System.out.print("as a Pourable: ");
		pourable.pour();

		System.out.print("as a Fillable: ");
		fillable.fill();

		// demo of passing lambda to method to do custom work
		// I do not like drinking handsanitizer, so lets pour it out, keeping the rest
		System.out.println("Now, pour out all handsanitizer, keeping everything else");
		System.out.println(drinks);
		drinks.stream()
						.filter((drink) -> drink.getLiquid() instanceof HandSanitizer)
						.forEach((drink) -> drink.pour());

		// uh oh! our pourabe bottle is hand saniziter and by default it cannot be poured out! lets redo that with a
		// passed handler to override the default pour
		System.out.println("Now, try that again! Pour out all handsanitizer, keeping everything else");
		drinks.stream()
						.filter((drink) -> drink.getLiquid() instanceof HandSanitizer)
						.forEach((drink) -> drink.empty(() -> System.out.println("I FORCE YOU TO POUR OUT HANDSANITIZER")));
	}
}
