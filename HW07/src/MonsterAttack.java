package Homework4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class MonsterAttack {
	private String monsterName;
	private String attackLocation;
	private String date;
	private double damagesInMillionUSD;
	
	public MonsterAttack() {}
	
	public void setMonsterName(String name) {
		monsterName = name;
	}
	
	public void setAttackLocation(String name) {
		attackLocation = name;
	}
	
	
	public void setDamagesInMillionUSD(double cost) {
		damagesInMillionUSD = cost;
	}
	
	public void setDate(String inDate) {
		date = inDate;
	}
	
	public String getMonsterName() {
		return monsterName;
	}
	
	public String getAttackLocation() {
		return attackLocation;
	}
	
	public String getDate() {
		return date;
	}
	public double getDamagesInMillionUSD() {
		return damagesInMillionUSD;
	}
	
	public String toString() {
		return ("The monster " + monsterName + " attacked " + attackLocation + " on " + date.toString() + " and has done " + damagesInMillionUSD + " million dollars of USD in damages.");
	}
}

