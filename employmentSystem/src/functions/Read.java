package functions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import employmentSystem.Employee;
import employmentSystem.MainClass;

public class Read {

	
	public static void reader() {
		
		
		Scanner scanner = MainClass.scanner;
				
		boolean leaveProgram = true;
		
		
		
			
				
				
				String choice;
				do {
					System.out.println("Would you like to see the whole list, or just one employee?");
					System.out.println("Type whole to see the whole list, type one to choose an employee.");
					choice = scanner.nextLine();
					
					if (!choice.equals("whole") && !choice.equals("one"))
						System.out.println("Please pick one of the two choices. Nothing else.");
				} while (!choice.equals("whole") && !choice.equals("one"));
				
				
				if (choice.equals("whole")) {
					for (int key : MainClass.empHash.keySet()) {
						System.out.println(MainClass.empHash.get(key));
					}
				}
				else if (choice.equals("one")) {
					
					System.out.println("Here are the possible IDs to read:");
					
					for (int key : MainClass.empHash.keySet()) {
						System.out.println(key);
					}
					int updateID;
					
					do {
						System.out.println("Enter ID of user you want to view: ");
						
						
						while (!scanner.hasNextInt()) {
							scanner.nextLine();
							System.out.println("Please print an integer.");
						}
						updateID = scanner.nextInt();
						
						if (!MainClass.empHash.containsKey(updateID)) {
							System.out.println("Please pick one of the possible IDs.");
							scanner.nextLine();
						}
						
							
					}
					
					while (!MainClass.empHash.containsKey(updateID));
					
					
					Employee employee = MainClass.empHash.get(updateID);
					
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
					
					
					int choiceView;
					
					do {
						System.out.println("Choose between 0 and 12.");
						
						
						while (!scanner.hasNextInt()) {
							System.out.println("Print a real number.");
							scanner.nextLine();
						}
						
						
						
						choiceView = scanner.nextInt();
						if (choiceView != 0 && choiceView != 1 && choiceView != 2 &&
							choiceView != 3 && choiceView != 4 && choiceView != 5 &&
							choiceView != 6 && choiceView != 7 && choiceView != 8 && 
							choiceView != 9 && choiceView != 10 && choiceView != 11 && 
							choiceView != 12) 
						{
							System.out.println("Please pick one of the thirteen choices. Nothing else.");
							//scanner.nextLine();
						}
					}
					
					while (choiceView != 0 && choiceView != 1 && choiceView != 2 &&
							choiceView != 3 && choiceView != 4 && choiceView != 5 &&
							choiceView != 6 && choiceView != 7 && choiceView != 8 && 
							choiceView != 9 && choiceView != 10 && choiceView != 11 && 
							choiceView != 12);
					
					switch(choiceView) {
					case 0: 
						System.out.println("These are all details about the employee:");
						System.out.println(employee);
						
						break;
					case 1: 
						System.out.println("This is the date of birth:");
						System.out.println(employee.getDateOfBirth());
						
						break;
					case 2: 
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
						System.out.println();
						break;
					case 7: 
						System.out.println("This is the full name:");
						System.out.println(employee.getFullName());
						break;
					case 8: 
						System.out.println("This is the phone number:");
						
						double phoneNumber = employee.getPhoneNumber();
						String phoneString = String.format("%.0f\n", phoneNumber);
						System.out.println(phoneString.substring(0, 3) + "-" 
								+ phoneString.substring(3, 6)
								+ "-" + phoneString.substring(6, 10));
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
						
						break;	
				}
					//scanner.nextLine();
					
				}
				else {
					System.out.println("Please print one of the two choices.");
				}

		
		
	}
	
	
}
