package FinalSample;

public abstract class Scavenger {
	
	protected int mouthCapacity;
	protected String animal;
	
	public Scavenger() {};
	
	public Scavenger(int mouthCapacity, String animal) {
		this.mouthCapacity = mouthCapacity;
		this.animal = animal;
	}
	
	public void bite(Scrap food) {
		
		if(food.getGrams() > mouthCapacity) {
			System.out.println(animal + " bites " + food.toString() + " and gets " + mouthCapacity + " mg");
			food.reduce(mouthCapacity);
		}else {
			System.out.println(animal + " bites " + food.toString() + " and gets " + food.getGrams() + " mg");
			food.reduce(mouthCapacity);
		}

	}
	
	public void setMouthCapacity(int amount) {
		mouthCapacity = amount;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public int getMouthCapacity() {
		return mouthCapacity;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public abstract String toString();
	
}
