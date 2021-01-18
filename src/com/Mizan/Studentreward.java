package com.Mizan;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Studentreward {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char ch = ' ';

		System.out.println("Enter Valu by following instraction");
		System.out.println("A. for Absance");
		System.out.println("L. for Late");
		System.out.println("P. for Present");
		System.out.print("Which Latter would you Like to Enter : ");
		ch = sc.next().charAt(0);
		System.out.println("Go ahead and select any two days of attendence by using Latter.\n");

		switch (ch) {
		case 'A':
			System.out.print("Enter an Attendents By a Latter : ");
			ch = sc.next().charAt(0);
			System.out.print("Enter Another Attendents By a Latter : ");
			ch = sc.next().charAt(0);
			if (ch == ch++) {
				System.out.println("He is Not Eligible to get Reword.");
			}
			break;
		case 'L':
			System.out.print("Enter an Attendents By a Latter : ");
			ch = sc.next().charAt(0);
			System.out.print("Enter Another Attendents By a Latter : ");
			ch = sc.next().charAt(0);
			if (ch == ch++) {
				System.out.print("He is Not Eligible to get Reword. : ");
			}
			break;
		case 'P':
			System.out.print("Enter an Another Attendents : ");
			ch = sc.next().charAt(0);
			System.out.print("Enter Another Attendents By a Latter : ");
			ch = sc.next().charAt(0);
			if (ch == ch++) {
				System.out.println("Congratulation!! you were Achived Reward");
			}
			break;

		default:
			System.out.println("You choose a Wrong Latter.");
			System.out.println("******* Good bye *********");
			break;
		}

	}
}
