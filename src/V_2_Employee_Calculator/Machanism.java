package V_2_Employee_Calculator;

import java.util.Scanner;

public class Machanism {
	Scanner input = new Scanner(System.in);
	String nameOfemployee;
	double numberOfHourWorked;
	double hourlyPayRate= 0;
	double grossPay = 0;
	int i = 0;
	
	
	
	void welcome() {
		System.out.println("Employee Payment Calculator");
		System.out.println("Please Follow the instruction and provide appropriate input when Prompt\n");
		
	}
	void usreInputs() {
		System.out.print("Please Enter the Name Of Employee : ");
		nameOfemployee = input.nextLine();
		System.out.print("Please Enter the Number of Total Hour Employee Worked : ");
		numberOfHourWorked = input.nextDouble();
		System.out.print("Please Enter the hourly Pay Rate assign for Mr "+nameOfemployee+ " : ");

	}
	void calculation() {
		hourlyPayRate = input.nextDouble();
		grossPay = numberOfHourWorked*hourlyPayRate;
	}
	void showManue() {
//		hourlyPayRate = input.nextDouble();
//		grossPay = numberOfHourWorked*hourlyPayRate;
		System.out.println("");
		System.out.println("Employee Name Mr : "+nameOfemployee);
		System.out.println("Number of Hours worked : "+numberOfHourWorked);
		System.out.println("Hourly Payment Rate Of Employee : "+hourlyPayRate);
		System.out.println("The total Payment for Employee is : "+grossPay);
		System.out.println();
		
	}
	void exit() {
		if (i>0||i<9) {
			System.out.print("Please enter any number for exit.");
			i = input.nextInt();
			System.out.println("Thanks for using Employee Payment Calculator");
			System.exit(0);
			
		}
	}
}
