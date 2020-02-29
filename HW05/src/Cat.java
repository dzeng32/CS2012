package Homework5;

public class Cat extends Predator{
	
	public Cat(String nameIn, double weight) {
		name = nameIn;
		weightInGrams = weight;
	}
	
	@Override
	public void call() {
		System.out.println( name + " says 'MEOW~!' ");
	}
	
	@Override
	public String toString() {
		return name + " is a Cat weighing " + weightInGrams + " grams";
	}

}
