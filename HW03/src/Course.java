package Homework3;

public class Course {
	
	private String courseID;
	private int courseUnits;
	
	public Course() {}
	
	public Course(String course, int units) {
		courseID = course;
		courseUnits = units;
	}
	
	public void setCourseID(String course) {
		courseID = course;
	}
	
	public void setUnits(int units) {
		courseUnits = units;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public int getUnits() {
		return courseUnits;
	}
	
	public String toString() {
		return "Course ID: " + courseID + "\nUnits: " + courseUnits;
	}
}
