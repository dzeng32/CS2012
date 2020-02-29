package Homework3;

import java.util.ArrayList;

public class FacultyMember extends Person{
	/*FacultyMember is also subclass of Person.
	 *  A FacultyMember has an employee id number and a teaching schedule, 
	 *  which is an ArrayList of Courses. Provide a way to assign a 
	 *  FacultyMember to teach an existing Course and for a Faculty 
	 *  member to find a class in the list and drop it.
	 */
	
	private String employeeID;
	private ArrayList<Course> teachSchedule = new ArrayList<>();
	
	public void setEmployeeID(String ID) {
		employeeID = ID;
	}
	
	public void addCourse(Course courseName) {
		teachSchedule.add(courseName);
	}
	
	public void dropCourse(Course courseName) {
		for(int i = 0; i < teachSchedule.size(); i++) {
			if(teachSchedule.get(i).getCourseID().equals(courseName.getCourseID())) {
				teachSchedule.remove(i);
				break;
			}
		}
		System.out.println("There is no course matching: " + courseName.getCourseID());
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public ArrayList<Course> getTeachSchedule() {
		return teachSchedule;
	}
	
	public String toString() {
		return "EmployeeID: " + employeeID + "\n" + teachSchedule.toString();
	}
}
