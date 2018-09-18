package ComputeArea;

import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 9-14-18
 * average calculator
 */

public class ComputeAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double period1;
		double period2;
		double period3;
		double period4;
		double period5;
		double period6;
		double period7;
		double period8;
		double period9;
		double period10;
		double sum;
		double average;
		
	    //user prompt
		System.out.println("Enter the scores in all 10 of your classes scores");
		//get the users scores
		period1 = input.nextDouble();
		period2 = input.nextDouble();
		period3 = input.nextDouble();
		period4 = input.nextDouble();
		period5 = input.nextDouble();
		period6 = input.nextDouble();
		period7 = input.nextDouble();
		period8 = input.nextDouble();
		period9 = input.nextDouble();
		period10 = input.nextDouble();
		
		
		//sum all scores
		sum = period1+period2+period3+period4+period5+period6+period7+period8+period9+period10;
		
		//divide by total
		average = sum / 10;
		
		//display average
		System.out.println("your average score is " + average);
		
		

	}

}
