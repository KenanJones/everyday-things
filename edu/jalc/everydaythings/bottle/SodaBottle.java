package jalc.everydaythings.bottle;

import jalc.everydaythings.liquid.Soda;

public class SodaBottle {
	private double capacity;
	private Soda soda;

	private SodaBottle() {
		this.capacity = 0;
		this.soda = null;
	}

	public SodaBottle(double capacity, Soda soda) {
		this.capacity = capacity;
		this.soda = soda;
	}

	public double getCapacity() {
		return capacity;
	}

	public Soda getSoda() {
		return soda;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getSoda();
	}

}
