package FinalSample;

public class Shape3DDriver {

	public static void main(String args[]) {
		
		Sphere circle = new Sphere(5);
		Cube square = new Cube(6);
		
		System.out.println(circle.toString());
		System.out.println(circle.getEquivalentCube().toString());
		
		System.out.println(square.toString());
		System.out.println(square.getEquivalentCube().toString());
	}
}
