package V_4_Employee_Calculator;

import java.util.Scanner;

public class Additional_Employee extends Employee_Details {

	Scanner input = new Scanner(System.in);
	static final int MAXIMUM_EMPLOYEE = 250;
	int totalEmployeeCount = 1;
	boolean continu = true;
	char option = ' ';
	

	void employCount() {
		welcomeMessage();
		while (continu = true && totalEmployeeCount <= MAXIMUM_EMPLOYEE);
		if (totalEmployeeCount > 0) {
			System.out.println("Do You Want to Calculate Payment For More Employees??");
		} else {
			System.out.println("Do You Want to Calculate Payment For an Employees??");
		}
		System.out.println("Please Enter “Y” for continue Or “N” for Stop");
		option = input.next().charAt(option);
		if (option == 'Y' || option == 'y') {
			totalEmployeeCount = totalEmployeeCount + 1;

		}
	}

}
