package Homework4;

import java.io.IOException;
import java.util.Scanner;

public class MonitorDriver {
	
	public static void main(String args[]) {
		
		AttackMonitor test = new AttackMonitor();
		Scanner input = new Scanner(System.in);
		int choice;
		try {
			do {
				System.out.println("Pick an option: \n1. Report attacks \n2. Save attacks to file "
						+ "\n3. Read attack from file \n4. Show monster attacks "
						+ "\n5. Show damages \n6. Show attacked dates \n0. Exit");
				choice = input.nextInt();
				input.nextLine();
				
				if(choice == 1)
					test.reportAttacks();
				if(choice == 2)
					test.writeData();
				if(choice == 3)
					test.replaceOldData();
				if(choice == 4)
					test.showAttacks();
				if(choice == 5)
					test.showDamages();
				if(choice == 6)
					test.findAttacks();
				if(choice > 6 || choice < 0)
					System.out.println("Invalid choice");
				
			}while(choice != 0);
			
		}catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
		
	}
	
}
