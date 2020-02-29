package ClassEx10;

public class Cupcake extends Portion{
	
	private final double PI = 3.14159;
	private double volume;
	
	Cupcake(double radius, double height){
		volume = PI * radius * radius * height;
		super.caloriesPerServing = 4 * volume;
	}
	
	@Override
	public String toString() {
		return "cupcake of volume " + volume + " and " + super.caloriesPerServing + " calories.";
	}

}
