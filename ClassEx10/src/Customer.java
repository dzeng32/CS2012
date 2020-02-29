package ClassEx10;

public class Customer {

	private double consumedCalories = 0;
	
	Customer(){}
	
	Customer(Portion p){
		eat(p);
	}
	
	public void eat(Portion p) {
		
		consumedCalories += p.getCalories();
		System.out.println("Customer eats a " + p.toString());
		
	}
	
	public double consumedCalories() {
		return consumedCalories;
	}
	
}
