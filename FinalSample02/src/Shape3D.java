package FinalSample;

public abstract class Shape3D {

	protected double volume;
	
	public boolean isLargerThan(Shape3D test) {
		if(volume > test.volume)
			return true;
		return false;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public abstract Cube getEquivalentCube();
}
