package Homework5;

public abstract class Animal {
	protected String name;
	protected double weightInGrams;
	
	public Animal() {}
	
	public Animal(String nameIn, double weight) {
		name = nameIn;
		weightInGrams = weight;
	}
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	public void setWeight(double weight) {
		weightInGrams = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weightInGrams;
	}
	
	public String toString() {
		return name + " weighs " + weightInGrams;
	}
	
	public abstract void call();
}
