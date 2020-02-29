package FinalSample;

public class Vulture extends Scavenger{

	public Vulture() {
		super.mouthCapacity = 50;
		super.animal = "Vulture";
	}
	
	@Override
	public String toString() {
		return animal + " has a mouth capacity of " + mouthCapacity + " mg";
	}
}
