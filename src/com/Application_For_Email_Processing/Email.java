package com.Application_For_Email_Processing;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySyffix ="khanom.com";

	// Constractor to received the first name and last name.
	public Email(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
		System.out.println("NAME OF EMPLOYEE : " + this.firstname + " " + this.lastName);

		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);


		// Combine elements to generate email address
		email = firstname.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySyffix;
		System.out.println("Here is your new email address : " + email);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your new password : " + this.password);

	}

	// Ask for the department.
	private String setDepartment() {
		System.out.print(
				"\nDEPARTMENT CODES\n1 for Salse\n2 for Developement\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "Salse";
		} else if (depChoice == 2) {
			return "Developement";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}

	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);

	}

	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set the alternate email
	public void setAlternaetEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternatEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "\nDISPLAY NAME : "+ firstname + " "+ lastName+
				"\nCOMPANY EMAIL : "+ email +
				"\nMAILBOX CAPACITY : "+mailboxCapacity+ " MB";
				
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
