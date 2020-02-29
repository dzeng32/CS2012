package FinalSample;

public class Ant extends Scavenger{
	
	public Ant() {
		super.mouthCapacity = 1;
		super.animal = "Ant";
	}
	
	@Override
	public String toString() {
		return animal + " has a mouth capacity of " + mouthCapacity + " mg";
	}

}
