package Homework5;

public class Mouse extends Prey {

	public Mouse(double weight, String nameIn) {
		name = nameIn;
		weightInGrams = weight;
	}
	
	@Override
	public void call() {
		System.out.println( name + " says 'squeak squeak' ");
	}
	@Override
	public void flee() {
		System.out.println(name + " scurries away!");
	}
}
