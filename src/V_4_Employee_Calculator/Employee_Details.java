package V_4_Employee_Calculator;

import java.util.Scanner;

public class Employee_Details {
	//Additional_Employee ae = new Additional_Employee();
	
	Scanner input = new Scanner(System.in);
 	String nameOfemployee;
	double numberOfHourWorked;
	double hourlyPayRate = 0;
	double grossPay = 0;
	double netPay = 0;
	int i = 0;
	void welcomeMessage() {
		System.out.println("\n*************** Welcom to Employee Payment Calculator ****************");
		System.out.println("Please Follow the instruction and provide appropriate input when Prompt\n");
		 
		
	}
	
	void getInputs() {
		System.out.print("\nPlease Enter the Name Of Employee : ");
		nameOfemployee = input.nextLine();
		System.out.print("\nPlease Enter the Number of Total Hour Employee Worked : ");
		numberOfHourWorked = input.nextDouble();
		System.out.print("\nPlease Enter the hourly Pay Rate assign for Mr " + nameOfemployee + " : ");
	}

	void calculatePayment() {
		hourlyPayRate = input.nextDouble();
		grossPay = numberOfHourWorked * hourlyPayRate;
	}

	void calculateNetPay() {
		if (grossPay < 1500) {
			netPay = grossPay * (1 - .15);
		} else if (grossPay >= 1500 && grossPay <= 3000) {
			netPay = grossPay * (1 - .19);
		} else if (grossPay >= 3000 && grossPay <= 4500) {
			netPay = grossPay * (1 - .21);
		} else if (grossPay >= 4500 && grossPay <= 6000) {
			netPay = grossPay * (1 - .23);
		} else if (grossPay >= 6000) {
			netPay = grossPay * (1 - .27);
		} else {
			System.out.println("Your Earning is not sufficieant for Tax");
		}

	}

	void displayOutput() {
		System.out.println("");
		System.out.println("Employee Name Mr : " + nameOfemployee);
		System.out.println("Number of Hours worked : " + numberOfHourWorked);
		System.out.println("Hourly Payment Rate Of Employee : " + hourlyPayRate);
		System.out.println("The Gross Payment before Tax is : " + grossPay);
		System.out.println("The Net Payment After Tax : " + netPay);
		System.out.println();

	}

	void exitProgram() {
		if (i > 0 || i < 9) {
			System.out.print("Please enter any number for exit.");
			i = input.nextInt();
			System.out.println("\n**************** Thanks for using Employee Payment Calculator *****************");
			System.exit(0);

		}
	}


}
