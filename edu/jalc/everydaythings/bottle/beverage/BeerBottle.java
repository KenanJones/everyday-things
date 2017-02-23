package edu.jalc.everydaythings.bottle.beverage;

import edu.jalc.everydaythings.liquid.beverage.Beer;

public class BeerBottle extends BeverageBottle {

	private BeerBottle(){
		super(0, null);
	}

	public BeerBottle(double capacity, Beer beer){
		super(capacity, beer);
	}

	public Beer getBeer(){
		return (Beer) this.getLiquid();
	}


}
