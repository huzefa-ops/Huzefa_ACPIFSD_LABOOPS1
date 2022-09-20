package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class CredentialApp {
	public static void main(String args[]) {
		Employee emp = new Employee("Arun","Kumar");
		CredentialService credentialservice = new CredentialService();
	System.out.println("Please enter the department from the following");
	System.out.println("1. Technical ");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal ");
	
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	String generatedEmail;
	char[] generatedpwd = generatedpwd = credentialservice.generatePassword();;
	switch(option) {
	case 1:
		generatedEmail = credentialservice.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"tech");
		credentialservice.showCredentials(emp.getFirstName(), generatedEmail, generatedpwd);
		
		break;
		
	case 2:
		generatedEmail = credentialservice.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Admin");
		credentialservice.showCredentials(emp.getFirstName(), generatedEmail, generatedpwd);
		break;
		
	case 3:
		generatedEmail = credentialservice.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"HumanResource");
		credentialservice.showCredentials(emp.getFirstName(), generatedEmail, generatedpwd);
		break;
		
	case 4:
		generatedEmail = credentialservice.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Legal");
		credentialservice.showCredentials(emp.getFirstName(), generatedEmail, generatedpwd);
		break;
		
	}if (option > 4) {
		System.out.println("Enter valid option");
		System.exit(-1);
	}
	sc.close();
	
	}

}
