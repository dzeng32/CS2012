package FinalSample;

public class Cube extends Shape3D{

	private double length;
	
	public Cube(double length) {
		volume = Math.pow(length, 3);
		this.length = length;
	}
	
	@Override
	public Cube getEquivalentCube() {
		return this;
	}
	
	public String toString() {
		return "Cube with side " + length + " and volume " + volume;
	}
}
