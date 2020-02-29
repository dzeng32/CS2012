package FinalSample;

public class Sphere extends Shape3D{
	
	private double radius;
	
	public Sphere(double radius) {
		volume = 4.0/3 * Math.PI * Math.pow(radius, 3);
		this.radius = radius;
	}
	
	@Override
	public Cube getEquivalentCube() {
		double length = Math.pow(volume, 1.0/3);
		return new Cube(length);
	}
	

	public String toString() {
		return "Sphere with a radius of " + radius + " and volume " + volume;
	}
}
