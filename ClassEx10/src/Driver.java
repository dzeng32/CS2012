package ClassEx10;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		
		int pancakeCount = 0, cupcakeCount = 0;
		
		Customer fred = new Customer();
		
		
		while(fred.consumedCalories() < 10000) {
			Cupcake cup = new Cupcake(new Random().nextInt(4) + 1, new Random().nextInt(4) + 1);
			Pancake pan = new Pancake(new Random().nextInt(4) + 1);
			
			if(new Random().nextBoolean()) {
				pancakeCount++;
				fred.eat(pan);
			}else if(!new Random().nextBoolean()) {
				cupcakeCount++;
				fred.eat(cup);
			}
		}
		System.out.println("Customer has eaten " + pancakeCount + " pancakes and " + cupcakeCount + " cupcakes before exploding.");
	}
	
}
