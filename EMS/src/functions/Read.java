package functions;

import java.util.HashMap;
import java.util.Scanner;

import employmentSystem.Employee;
import employmentSystem.MainClass;

public class Read {

	
	public static void reader() {
		System.out.println("You're reading.");
		
		
		
		Scanner scanner = MainClass.scanner;
		

		System.out.println("Here are the possible IDs to read:");
		
		for (int key : MainClass.empHash.keySet()) {
			System.out.println(key);
		}
		
		
		
		System.out.println("Enter ID of user you want to view: ");
		int updateID = scanner.nextInt();
		Employee employee = MainClass.empHash.get(updateID);
		//Don't continue if not actually existing ID.***
		
		System.out.println("What detail would you like to view?");
		System.out.println("Please note that, due to safety reasons, "
				+ "we only allow one item to be viewed at a time.");
		System.out.println("But you may view all details at once.");
		//Choices
		System.out.println("Press 0 to view all details about the employee.");
		System.out.println("Press 1 for viewing the date of birth.");
		System.out.println("Press 2 for viewing the department worked in.");
		System.out.println("Press 3 for viewing the email.");
		System.out.println("Press 4 for viewing the job title.");
		System.out.println("Press 5 for viewing the social security number.");
		System.out.println("Press 6 for viewing the salary.");
		System.out.println("Press 7 for viewing the full name.");
		System.out.println("Press 8 for viewing the phone number.");
		System.out.println("Press 9 for viewing all details in their address.");
		System.out.println("Press 10 for viewing the gender.");
		System.out.println("Press 11 for viewing the age.");
		System.out.println("Press 12 for viewing the day the employee started work.");
		
		
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 0: 
				System.out.println("These are all details about the employee:");
				System.out.println(employee);
				break;
			case 1: 
				System.out.println("This is the date of birth:");
				System.out.println(employee.getDateOfBirth());
				break;
			case 2: //
				System.out.println("This is the department:");
				System.out.println(employee.getDept());
				break;
			case 3: 
				System.out.println("This is the email:");
				System.out.println(employee.getEmail() + "@Collabera.com");
				break;
			case 4: 
				System.out.println("This is the job title:");
				System.out.println(employee.getJobTitle());
				break;
			case 5: 
				System.out.println("This is the social security number:");
				int ssn = employee.getSsn();
				String ssnString = Integer.toString(ssn);
				System.out.println(ssnString.substring(0, 3) + "-" + ssnString.substring(3, 5) + "-" + ssnString.substring(5, 9));
				break;
			case 6: 
				System.out.println("This is the salary:");
				System.out.print("$");
				System.out.printf("%.2f", employee.getSalary());
				break;
			case 7: 
				System.out.println("This is the full name:");
				System.out.println(employee.getFullName());
				break;
			case 8: 
				System.out.println("This is the phone number:");
				
				long phoneNumber = employee.getPhoneNumber();
				System.out.println(Long.toString(phoneNumber).substring(0, 3) + "-" 
						+ Long.toString(phoneNumber).substring(3, 6)
						+ "-" + Long.toString(phoneNumber).substring(6, 9));
				break;
			case 9: 
				System.out.println("This is the person's complete address:");
				System.out.println(employee.getAddress().toString());
				break;
				
			case 10: 
				System.out.println("This is the person's gender:");
				System.out.println(employee.getGender());
				break;	
			
			case 11: 
				System.out.println("This is the person's age:");
				System.out.println(employee.getAge());
				break;
			
			case 12: 
				System.out.println("This is the person's date they started work:");
				System.out.println(employee.getDateStartWork());
				break;
				
			default:
				System.out.println("You have inputted something invalid.");
				//Somehow get the statement to start over.
				break;
		
		}
		
		
		System.out.println("This is the current date of birth: ");
		System.out.println(employee.getDateOfBirth());
	}
	
	
}
