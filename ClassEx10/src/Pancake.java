package ClassEx10;

public class Pancake extends Portion{

	private final double PI = 3.14159;
	private double radius;
	
	Pancake(double userRadius){
		radius = userRadius;
		super.caloriesPerServing = 10 * PI * userRadius * userRadius; 
	}
	
	@Override
	public String toString() {
		return "pancake of radius " + radius + " and " + super.caloriesPerServing + " calories.";
	}
}
