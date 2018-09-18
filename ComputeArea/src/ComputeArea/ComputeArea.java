package ComputeArea;

import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 9-14-2018
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//constant declinations
		double PI = 3.1415926535897932384626433832;
		
		//step one; enter the radius of a circle
		double radius;
		double area;
		
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextint();
		System.out.println(radius);
		
		//step two: compute the area using the following formula:
		//area = radius*radius*pi
		area = radius*radius*PI;
		
		//step three: display result
		
		
	

	}

}
