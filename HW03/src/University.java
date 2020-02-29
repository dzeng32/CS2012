package Homework3;

import java.util.Scanner;

public class University {
	/*Write a University class that maintains lists of Students, Courses, 
	 * and FacultyMembers and has an instance method containing a menu that 
	 * provides ways to list them and to create them and add them to the list.
	 *  Provide ways to delete Students and FacultyMembers and for Students 
	 *  and FacultyMembers to add and delete Courses from their course schedules.
	 */
	Scanner input = new Scanner(System.in);
	int option;
	String userInput;
	Student newStudent = new Student();
	Course courses = new Course();
	FacultyMember newEmployee = new FacultyMember();
	
	public void menu(int choice) {
		
		
		if(choice == 1) {
			System.out.println("Please choose your option: \n1. Add a course \n2. Drop a course \n3. List of courses");
			option = input.nextInt();
				
			while(option < 0 || option > 1) {
				System.out.println("Invalid option. Please pick 1-3: ");
				choice = input.nextInt();
			}
			
			switch(option) {
			case 1:
				System.out.println("Enter course ID: ");
				userInput = input.nextLine();
				
				newStudent.addCourse(userInput);
				break;
				
			case 2:
				System.out.println("Enter course ID: ");
				userInput = input.nextLine();
				
				newStudent.dropCourse(userInput);
				break;
				
			case 3:
				newStudent.getCourseList();
				break;
			}
		}
		
		if(choice == 2) {
			System.out.println("Please choose your option: \n1. Add a course \n2. Drop a course \n3. List of courses");
			option = input.nextInt();
				
			while(option < 0 || option > 1) {
				System.out.println("Invalid option. Please pick 1-3: ");
				choice = input.nextInt();
			}
			
			switch(option) {
			case 1:
				System.out.println("Enter course ID: ");
				userInput = input.nextLine();
				
				newEmployee.addCourse(userInput);
				break;
				
			case 2:
				System.out.println("Enter course ID: ");
				userInput = input.nextLine();
				
				newEmployee.dropCourse(userInput);
				break;
				
			case 3:
				newEmployee.getTeachSchedule();
				break;
			}
		}
	}
}
