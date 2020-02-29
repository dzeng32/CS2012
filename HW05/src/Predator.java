package Homework5;

public abstract class Predator extends Animal{
	
	
	public void predate(Prey animal) {
		eat(animal.getWeight());
		System.out.println( name + " has eaten " + animal.getName() + " and weighs " + weightInGrams + " in grams.");
	}
	
	public void eat(double weight) {
		weightInGrams += weight;
	}
}
