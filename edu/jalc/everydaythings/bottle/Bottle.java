package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Liquid;

abstract public class Bottle implements Pourable, Fillable {

	private double capacity;
	private Liquid liquid;

	private Bottle(){
		this.capacity = 0;
	}

	public Bottle(double capacity, Liquid liquid){

		this.capacity = capacity;
		this.liquid = liquid;
	}

	public double getCapacity(){
		return this.capacity;
	}

	protected Liquid getLiquid(){
		return this.liquid;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getLiquid();
	}

	public void pour(){ System.out.println(this.getClass().getSimpleName() + " just poured"); }

	public void fill(){ System.out.println(this.getClass().getSimpleName() + " just filled"); }

	public void empty(Pourable pourable){
		pourable.pour();
	}
}
