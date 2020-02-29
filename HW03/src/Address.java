package Homework3;

public class Address {

	private int streetNumber;
	private String street;
	private String city;
	private String state;
	private String country;
	
	public Address() {}
	
	public Address(int streetNum, String streetName, String cityName, String stateName, String countryName) {
		streetNumber = streetNum;
		street = streetName;
		city = cityName;
		state = stateName;
		country = countryName;
	}
	
	public void setStreetNumber(int num) {
		streetNumber = num;
	}
	
	public void setStreetName(String name) {
		street = name;
	}
	
	public void setCity(String name) {
		city = name;
	}
	
	public void setState(String name) {
		state = name;
	}
	
	public void setCountry(String name) {
		country = name;
	}
	
	public int getStreetNumber() {
		return streetNumber;
	}
	
	public String getStreetName() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return streetNumber + " " + street + "\n" + city + " " + state + " " + country;
	}
}
