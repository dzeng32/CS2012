package Homework3;

public class Person {
	//A Person has a name and an Address 
	//(represented by an object of class Address, not a String). 
	//Note that the subclasses of Person inherit the fields and methods 
	//of Person. You may need to override some of the methods in the 
	//subclasses.

	private String name;
	private Address address = new Address();
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAddress(Address newAddress) {
		address = newAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public String toString() {
		return "Name: " + name + "\nAddress: " + address.toString();
	}
}
