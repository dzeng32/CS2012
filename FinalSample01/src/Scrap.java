package FinalSample;

public class Scrap {
	private int grams;
	private String type;
	
	public Scrap(int grams, String type) {
		this.grams = grams;
		this.type = type;
	}
	
	public void reduce(int amount) {
		if(grams > amount) {
			grams = grams - amount;
		}else 
			grams = 0;
	}
	
	public void setGrams(int grams) {
		this.grams = grams;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getGrams(){
		return grams;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return grams + " mg scrap of " + type;
	}
}
