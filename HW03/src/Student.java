package Homework3;

import java.util.ArrayList;

public class Student extends Person{
	/*Student is a subclass of Person. 
	In addition to the data inherited from Person, 
	a student has CIN and a course schedule represented by an ArrayList
	of Courses (objects of class Course). 
	You must provide ways for a Student to add and drop an 
	existing Course.*/
	
	private String cin;
	private ArrayList<Course> courses = new ArrayList<>();
	
	public void setCIN(String newCIN) {
		cin = newCIN;
	}
	
	public void addCourse(Course courseName) {
		courses.add(courseName);
	}
	
	public void dropCourse(Course courseName) {
		for(int i = 0; i < courses.size(); i++) {
			if(courses.get(i).getCourseID().equals(courseName.getCourseID())) {
				courses.remove(i);
				break;
			}
		}
		System.out.println("There is no course matching: " + courseName.getCourseID());
	}
	
	public String getCIN() {
		return cin;
	}
	
	public ArrayList<Course> getCourseList(){
		return courses;
	}
	
	public String toString() {
		return "Student CIN: " + cin + "\n" + courses.toString();
	}
}
