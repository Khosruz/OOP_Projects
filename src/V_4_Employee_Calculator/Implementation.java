package V_4_Employee_Calculator;

import java.util.Scanner;

public class Implementation extends Additional_Employee {

	static final int MAXIMUM_EMPLOYEE = 250;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// int maxEmployee = 5;
		int totalEmployeeCount = 0;
		boolean continu = true;
		char option = ' ';

		Employee_Details details = new Employee_Details();

		details.welcomeMessage();
		while (continu  && totalEmployeeCount <= MAXIMUM_EMPLOYEE) {
			if (totalEmployeeCount > 0) {
				System.out.println("Do You Want to Calculate Payment For More Employees??");
			} else {
				System.out.println("\nDo You Want to Calculate Payment For an Employees??");
			}
			System.out.println("\nPlease Enter “Y” for continue Or “N” for Stop");
			option = input.nextLine().charAt(0);
			if (option == 'Y' || option == 'y') {
				totalEmployeeCount = totalEmployeeCount + 1;

				details.getInputs();
				details.calculatePayment();
				details.calculateNetPay();
				details.displayOutput();
				System.out.println("Total " + totalEmployeeCount + " Employees Payment calculation Performed");

			} else {
				continu = false;
			}
			
		}
		details.exitProgram();

	}
}
