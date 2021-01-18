package V_1_Employee_Calculator;

import java.util.Scanner;

public class Employee_details {
	public static void main(String[] args) {
		String nameOfemployee;
		double numberOfHourWorked;
		double hourlyPayRate= 0;
		double grossPay = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name of Employee : ");
		nameOfemployee = input.nextLine();
		System.out.print("Enter Number Of Hours : ");
		numberOfHourWorked = input.nextDouble();
		System.out.print("Hourly Rate for "+nameOfemployee+ " : ");
		hourlyPayRate = input.nextDouble();
		grossPay = numberOfHourWorked*hourlyPayRate;
		System.out.println("\n\n");
		System.out.println("Mr "+nameOfemployee+ " Has worked "+numberOfHourWorked+ " Hours," + " and Gross Pay is " +grossPay);
		System.out.println();
		
	}

}
