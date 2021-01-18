package com.Student_Database_Application;

import java.util.Scanner;

public class Student_Database {

	public static void main(String[] args) {
   		// Ask how many new users we want to add
		System.out.print("Enter number of new students to enrolled: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Students[] students = new Students[numOfStudents];
		
		//Create n number of new students
		for(int n = 0; n< numOfStudents; n++) {
			students[n]  = new Students();
			students[n].enroll();
			students[n].paytution();
			System.out.println(students[n].toString());
			System.out.println("==============================================");
		}
	}

}
