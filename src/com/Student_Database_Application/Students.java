package com.Student_Database_Application;

import java.util.Scanner;

public class Students {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private  String courses ="";
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: pompt user to enter student's name and year
	public Students() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = sc.nextLine();
		System.out.print("Enter student last name : ");
		this.lastName = sc.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	// Generate and ID
	private void setStudentID() {
		// Grade level + ID;
		id++;
		this.studentID = gradeYear + " " + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit) : ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				 courses = "\t"+ courses +"\n"+ course ;
				tutionBalance = tutionBalance + costOfCourse;
			} else {
				System.out.println("\n------------------------------------------\n");
				break;
				}
			
		} while (1 != 0);{

			System.out.println("ENROLLED IN : " + (courses));
		System.out.println("TUTION BALANCE: " + tutionBalance);}
		
	}

	// view balance
	public void viewbalance() {
		System.out.println("Your current balance is : $" + tutionBalance);
	}

	// Pay Tution fees
	public void paytution() {
		viewbalance();
		System.out.print("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tutionBalance = tutionBalance  - payment;
		System.out.println("Thank you for your payments of $"+payment);
		viewbalance();
		System.out.println("-----------------------------------------");
	}
	//Show status
public String toString() {
	return "Name: " + firstName + " "+lastName + 
			"\nCourses Enrolled: "+courses+ 
			"\nBalance: $"+tutionBalance;
	}

}

