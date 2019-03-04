package emailApp;

import java.util.Scanner;

/**
 * 
 * Give first name and last name, prompts user for department
 * generates password and email address for new user
 * @author Chris M
 * 
 *
 */
public class Email {
	private String fName;
	private String lName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "abcompany.com";

	// Constructor to receive the first name and last name
	public Email(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;

		// Call a method asking for department - return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = fName.toLowerCase() + "." + lName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	// Ask for department from user 
	private String setDepartment() {
		String department;
		System.out.println("New Worker: " + fName + " " + lName);
		System.out.print("Department Codes\n1 - Sales \n2 - Developement \n3 - Accounting\n0 - None\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();

		if (deptChoice == 1) {
			department = "sales";
		} else if (deptChoice == 2) {
			department = "development";
		} else if (deptChoice == 3) {
			department = "accounting";
		} else {
			department = "";
		}
		return department;
	}

	// Generate random password
	private String randomPassword(int length) {
		// characters in string to be used for password generation
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set alternate email
	public void setAlernateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get mailbox capacity
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	// Get alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//Get password
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display name: " + fName + " " + lName + 
				"\nCompany email: " + email + 
				"\nMailbox capacity: " + mailboxCapacity + "mb";
	}
}
