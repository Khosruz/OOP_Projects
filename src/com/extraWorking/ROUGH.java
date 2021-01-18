package com.extraWorking;

import java.util.Scanner;

public class ROUGH {
	String customerName;
	String customerID;
	int balance;
	int previousTransection;

	ROUGH(String customerName, String customerID) {
		this.customerName = customerName;
		this.customerID = customerID;

	}

	void deposite(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransection = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransection = -amount;
		}
	}

	void getPreviosTransection() {
		if (previousTransection > 0) {
			System.out.println("Diposited : " + previousTransection);
		} else if (previousTransection < 0) {
			System.out.println("Withdraw : " + Math.abs(previousTransection));
		} else {
			System.out.println("No Transection occured");
		}
	}

	void show() {
		Scanner sc = new Scanner(System.in);
		char option = '\0';

		System.out.println("Welcome : " + customerName);
		System.out.println("Your ID : " + customerID);
		System.out.println();
		System.out.println("A. Check Balance: ");
		System.out.println("B. deposite");
		System.out.println("C. Withdraw ");
		System.out.println("D. previous Transactcion");
		System.out.println("E. Exit");
		System.out.println("\n");
		do {

			System.out.println("|=============================================================|");
			System.out.println("|*********************** Enter an Option *********************|");
			System.out.println("|=============================================================|");

			option = sc.next().charAt(0);
			switch (option) {
			case 'A':
				System.out.println("-----------------------------------------------------------");
				System.out.println("Balance : " + balance);
				System.out.println("-----------------------------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("-----------------------------------------------------------");
				System.out.println("Enter an amount to Diposite : ");
				System.out.println("-----------------------------------------------------------");
				int amount = sc.nextInt();
				deposite(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("-----------------------------------------------------------");
				System.out.println("Enter Withdrawl amount ");
				System.out.println("-----------------------------------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
			case 'D':
				System.out.println("-----------------------------------------------------------");
				System.out.println("Previous Transection : ");
				System.out.println("-----------------------------------------------------------");
				getPreviosTransection();
				System.out.println("\n");
				break;
			default:
				System.out.println("======= You select an Wrong Charecter !! Try again =======");
				break;
			}
			System.out.println("\n");
		} while (option != 'E');
		{
				System.out.println("============ Thank You for using our services ============");

		}
	}

}
