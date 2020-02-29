package ClassEx10;

public abstract class Portion {

	protected double caloriesPerServing;
	
	
	public void setCalories(double calories) {
		caloriesPerServing = calories;
	}
	
	public double getCalories() {
		return caloriesPerServing;
	}
	
	public abstract String toString();
}
