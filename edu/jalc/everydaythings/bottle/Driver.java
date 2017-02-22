package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Beer;
import edu.jalc.everydaythings.liquid.Soda;
import edu.jalc.everydaythings.liquid.Water;

import java.util.ArrayList;

public class Driver {
	public static void main(String... args){
		ArrayList<Bottle> drinks = new ArrayList<>();
		drinks.add(new SodaBottle(20, new Soda()));
		drinks.add(new BeerBottle(16, new Beer()));
		drinks.add(new WaterBottle(20, new Water()));

		for(Bottle bottle : drinks){
			System.out.println(bottle);
		}
	}
}
