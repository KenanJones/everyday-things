package jalc.everydaythings.bottle;

public class Bottle {

	private double capacity;

	private Bottle(){
		this.capacity = 0;
	}

	private Bottle(double capacity){
		this.capacity = capacity;
	}

	public double getCapacity(){
		return this.capacity;
	}
}
