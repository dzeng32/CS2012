package FinalSample;

import java.util.*;

public class Picnic {
	
	public static void main(String args[]) {
		Ant ant = new Ant();
		Vulture vulture = new Vulture();
		Scrap cheese = new Scrap(1009, "moldy cheese");
		Picnic picnic = new Picnic();
		
		picnic.addAnimal(ant);
		picnic.addAnimal(ant);
		picnic.addAnimal(ant);
		picnic.addAnimal(ant);
		picnic.addAnimal(ant);
		picnic.addAnimal(ant);
		picnic.addAnimal(vulture);
		
		picnic.setFood(cheese);
		
		picnic.feast();

	}
	
	private List<Scavenger> animals = new ArrayList<Scavenger>();
	private Scrap meal;
	
	public Picnic() {}
	
	public void addAnimal(Scavenger animal) {
		animals.add(animal);
	}
	
	public void setFood(Scrap food) {
		meal = food;
	}
	
	public void feast() {

		while(meal.getGrams() > 0) {
			
			for(int i = 0; i < animals.size(); i++) {
				animals.get(i).bite(meal);
				if(meal.getGrams() == 0)
					break;
			}
		}
		System.out.println("There is no more " + meal.getType());
	}
}
