package Week2;

import java.util.Scanner;

public class AreaOfCircle {
	private Object math;

	public static void main(String[] args) {
	
		String displayAreaOfCircle;
		
		// I am going to use PI for display area of the circle as mentioned below.
		
		double pi= 3.14, area;
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = Scanner.nextDouble();
		System.out.println("Area of the circle is: " + Math.PI * radius);
 
		
	}
}