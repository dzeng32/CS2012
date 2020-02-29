package Homework5;

public class Bird extends Prey{

	public Bird(double weight, String nameIn) {
		name = nameIn;
		weightInGrams = weight;
	}
	
	@Override
	public void call() {
		System.out.println(name + " says 'chirp chirp' ");
	}
	
	@Override
	public void flee() {
		System.out.println(name + " flies away!");
	}
	
}
