package V_4_Employee_Calculator;

import java.util.Scanner;

public class Rough {
	boolean isValid = false;
	String nameOfemployee;
	double numberOfHourWorked;
	double hourlyPayRate = 0;
	
	public static void main(String[] args) {
		Rough rr = new Rough();
		rr.nNumber();
		
	}
	public void nNumber() {
		Scanner sc = new Scanner(System.in);
		while(isValid == false) {
			System.out.println("Please Enter the Name Of Employee: ");
			nameOfemployee = sc.nextLine();
			if(nameOfemployee.isEmpty()) {
				isValid = true;
			}else {
				System.out.println("You didn’t Enter anything Please Enter a Name for Employee ");
			}
		}  
		while (isValid == false) {
			 System.out.println("Please Enter the Number of Total Hour Employee Worked");
			numberOfHourWorked = sc.nextDouble();
			if(numberOfHourWorked > 0 && numberOfHourWorked<=80) {
				isValid = true;
			}else {
				System.out.println("Please Enter a hour between 1 to 80 ");
				numberOfHourWorked = sc.nextDouble();
			}
		}
		while(isValid == false) {
			System.out.println("Please Enter the hourly Pay Rate assign for this employee");
			hourlyPayRate = sc.nextDouble();
			if(hourlyPayRate >= 8.95 && hourlyPayRate <= 50) {
				isValid = true;
			} else {
				System.out.println("Please Enter an Amount Between $8.95 To $");
				
			}
		}
	}

}
