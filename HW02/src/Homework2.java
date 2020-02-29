import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;
public class Homework2 {
	public static void main (String[] args) {
		//The Driver, should have named Homework2 MonitorDriver
		AttackMonitor test = new AttackMonitor();
		
		test.reportAttacks();
		test.showAttacks();
		test.showDamages();
		test.showMonsters();
	}
}


class MonsterAttack {
	private String monsterName;
	private String attackLocation;
	private Date date = new Date();
	//private String date;
	private double damagesInMillionUSD;
	
	void setMonsterName(String name) {
		monsterName = name;
	}
	
	void setAttackLocation(String name) {
		attackLocation = name;
	}
	
	void setDate(int year, int month, int day) {
		date = new Date(year, month, day);
	}
	
	void setDamagesInMillionUSD(double cost) {
		damagesInMillionUSD = cost;
	}
	
	String getMonsterName() {
		return monsterName;
	}
	
	String getAttackLocation() {
		return attackLocation;
	}
	
	Date getDate() {
		return date;
	}
	double getDamagesInMillionUSD() {
		return damagesInMillionUSD;
	}
	
	public String toString() {
		return ("The monster " + monsterName + " attacked " + attackLocation + " on " + date.toString() + " and has done " + damagesInMillionUSD + " million dollars of USD in damages.");
	}
}

class AttackMonitor {
	MonsterAttack[] array = new MonsterAttack[1];
	
	void reportAttacks(){
		Scanner input = new Scanner(System.in);
		double cost;
		String monsterName, attackLocation, date;
		int year, month, day;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new MonsterAttack();
			System.out.println("Please enter the monster that attacked: ");
			array[i].setMonsterName(input.nextLine());
			
			System.out.println("Please enter the attacked location: ");
			array[i].setAttackLocation(input.nextLine());
			
			System.out.println("Please enter the date of the attack: enter YYYY, then MM, then DD ");
			year = input.nextInt();
			month = input.nextInt();
			day = input.nextInt();
			array[i].setDate(year, month, day);	
			
			System.out.println("Please enter the amount of damage caused in the millions: ");
			array[i].setDamagesInMillionUSD(input.nextDouble());
			input.nextLine(); // eats left over inputs
			
			System.out.println("You have completed an entry.\n");
		}
	}
	
	void showAttacks() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
	
	void showDamages() {
		double totalDamage =0;
		for(int i =0; i < array.length; i++) {
			totalDamage += array[i].getDamagesInMillionUSD();
		}
		System.out.println("The total amount of damage in millions is: " + totalDamage);
	}
	
	void showMonsters() {
		int[] monsterCount = {0, 0, 0, 0, 0};
		//Adds a count for each time the monster name appears in the array.
		for(int i =0; i< array.length; i++) {
			for(int j = 1; j < array.length -1; j++) {
				if(array[i].getMonsterName().equals(array[j].getMonsterName()))
					monsterCount[i]++;
			}
		}
		
		System.out.println("The occurances of monster attacks are: ");
		for(int i =0; i < array.length; i++) {
			if(monsterCount[i] != 0)
				System.out.println(array[i].getMonsterName() + ": " + monsterCount[i] + " attack(s)");
		}
	}
	
	void findEarliestAttack() {
		
		for(int i =0; i < array.length; i++) {
			array[i].getDate();
		}
	}
}