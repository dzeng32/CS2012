package Homework4;

import java.util.*;
import java.io.*;

public class AttackMonitor {
	ArrayList<MonsterAttack> array = new ArrayList<>();
	private String userInput;
	
	public void reportAttacks(){
		Scanner input = new Scanner(System.in);
		array.add(new MonsterAttack());
		
		System.out.println("Enter the date of the monster attack (MM/DD/YYYY): ");
		array.get(array.size()-1).setDate(input.nextLine());
		
		System.out.println("Enter the name of the monster: ");
		array.get(array.size()-1).setMonsterName(input.nextLine());
		
		System.out.println("Enter the attacked location: ");
		array.get(array.size()-1).setAttackLocation(input.nextLine());
		
		System.out.println("Enter the damage in millions: ");
		array.get(array.size()-1).setDamagesInMillionUSD(input.nextDouble());
		
	}
	
	public void writeData() throws IOException{
		
		System.out.println("Enter file path for the text file: ");
		Scanner input = new Scanner(System.in);
		
		File file = new File(input.next());
		PrintWriter output = new PrintWriter(file);
		
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		for(int i = 0; i < array.size(); i++) {
			output.print(array.get(i).getDate() + "," + array.get(i).getMonsterName() + "," 
		+ array.get(i).getAttackLocation() + "," + array.get(i).getDamagesInMillionUSD() + "\r\n");
		}
		output.close();
	}
	
	public void replaceOldData() throws IOException{
		array.clear();
		
		System.out.println("Enter file path for the text file: ");
		Scanner input = new Scanner(System.in);
		
		File file = new File(input.next());
		Scanner freader = new Scanner(file);
		String[] split;
		
		while(freader.hasNextLine()) {
			split = freader.nextLine().split(",");
			
			double value;
			array.add(new MonsterAttack());
			array.get(array.size() - 1).setDate(split[0]);
			array.get(array.size() - 1).setMonsterName(split[1]);
			array.get(array.size() - 1).setAttackLocation(split[2]);
			array.get(array.size() - 1).setDamagesInMillionUSD( value = Double.parseDouble(split[3]));
		}
		freader.close();
	}
	/* Homework 4
	public void showAttacks() {
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
	}
	*/
	//Homework 7
	public String showAttacks() {
		String output = "";
		for(int i = 0; i < array.size(); i++) {
			output += array.get(i).toString() + "\n";
		}
		return output;
	} // end of homework 7
	/* Homework 4
	public void showDamages() {
		double totalDamage =0;
		for(int i =0; i < array.size(); i++) {
			totalDamage += array.get(i).getDamagesInMillionUSD();
		}
		System.out.println("The total amount of damage in millions is: " + totalDamage);
	}
	*/
	//Homework 7
	public String showDamages() {
		String output = "";
		double totalDamage =0;
		for(int i =0; i < array.size(); i++) {
			totalDamage += array.get(i).getDamagesInMillionUSD();
		}
		output += "The total amount of damage in millions is: " + totalDamage;
		return output;
	} // end of homework 7
	
	public void showMonsters() {
		
		for(int i =0; i< array.size(); i++) {
			System.out.println(array.get(i).getMonsterName());
		}
	}
	/* Homework 4
	public void findAttacks() {
		
		for(int i =0; i < array.size(); i++) {
			System.out.println(array.get(i).getDate());
		}
	}
	*/
	//Homework 7
	public String findAttacks() {
		String output = "";
		for(int i =0; i < array.size(); i++) {
			output += array.get(i).getDate() + "\n";
		}
		
		return output;
	}
	
}
