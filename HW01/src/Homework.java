import java.util.Scanner;
import java.lang.Math;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] testArray = new double[10];
		
		testArray = array();
		printArray(testArray);
		
		arrayCubed(testArray);
		printArray(testArray);
		
		change250(testArray);
		printArray(testArray);
		
		inverseArray(testArray);
		printArray(testArray);
		
	}
	//1
	public static double[] array() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 non-negative doubles: ");
		
		double userNum = input.nextDouble();
		double[] array = new double[10];
		int count = 0;
		
		while(count < 10) {
			
			if(userNum < 0) {
				System.out.println("It is negative. Please re-enter your number: ");
				userNum = input.nextDouble();
			}
			array[count] = userNum;
			count++;
				
		}
		return array;
	}
	//2
	public static void arrayCubed(double[] array) {
		System.out.println("The array values cubed are: ");

		for(int count = 0; count < array.length; count++) {
			System.out.print( Math.pow(array[count], 3) + " ");
		}
	    System.out.println("");
	}
	//3
	public static void change250(double[] array) {
		for(int count = 0; count < array.length; count++) {
			if(array[count] > 250)
				array[count] = 250;
		}
	}
	//4
	public static double[] inverseArray(double[] array) {
		double[] copyArray = new double[array.length];
		
		for(int count = 0; count < array.length; count++) {
			copyArray[count] = array[count];
			array[count] = 1.0 / copyArray[count];
		}
		return array;
	}
	
	public static void printArray(double[] array) {
		System.out.println("The array values are: ");
		
		for(int count = 0; count < array.length; count++) {
			System.out.print(array[count] + " ");
		}
	    System.out.println("");

	}
}
