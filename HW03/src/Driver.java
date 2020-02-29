package Homework3;

import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int choice;
		University mainMenu = new University();
		
		do {
			System.out.println("Please pick an option: \n1. Are you a student? \n2. Are you a faculty member? ");
			choice = input.nextInt();
			
			while(choice < 0 || choice > 2) {
				System.out.println("Invalid choice. Please pick 1 or 2: ");
				choice = input.nextInt();
			}
			mainMenu.menu(choice);
			
		}while(choice !=0);
	}
	
}
