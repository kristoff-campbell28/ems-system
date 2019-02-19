package functions;

import java.util.Scanner;

import employmentSystem.Employee;
import employmentSystem.MainClass;

public class Read {

	public static void reader() {

		Scanner scanner = MainClass.scanner;
		boolean largeOrSmall = true;
		boolean leaveProgram = true;

		while (largeOrSmall) {
			System.out.println("Press 1 to see the whole list, press 2 to choose an employee.");
			int choice = Helpers.validateInt(scanner);
			if (choice == 1) {
				for (Employee key : MainClass.empHash.values()) {
					System.out.println(key);
				}
				largeOrSmall = false;
			} else if (choice == 2) {
				largeOrSmall = false;
			} else {
				System.out.println("Please print one of the two choices.");
			}
		}

		while (leaveProgram) {
			System.out.println("Enter ID of user you want to view: ");

			int updateID = Helpers.validateInt(scanner);

			Employee employee = MainClass.empHash.get(updateID);
			// Don't continue if not actually existing ID.***

			/*
			 * System.out.println("What detail would you like to view?");
			 * System.out.println("Please note that, due to safety reasons, " +
			 * "we only allow one item to be viewed at a time.");
			 * System.out.println("But you may view all details at once."); // Choices
			 * System.out.println("Press 0 to view all details about the employee.");
			 * System.out.println("Press 1 for viewing the date of birth.");
			 * System.out.println("Press 2 for viewing the department worked in.");
			 * System.out.println("Press 3 for viewing the email.");
			 * System.out.println("Press 4 for viewing the job title.");
			 * System.out.println("Press 5 for viewing the social security number.");
			 * System.out.println("Press 6 for viewing the salary.");
			 * System.out.println("Press 7 for viewing the full name.");
			 * System.out.println("Press 8 for viewing the phone number.");
			 * System.out.println("Press 9 for viewing all details in their address.");
			 * System.out.println("Press 10 for viewing the gender.");
			 * System.out.println("Press 11 for viewing the age.");
			 * System.out.println("Press 12 for viewing the day the employee started work."
			 * );
			 */

			int choice = Helpers.validateInt(scanner);

			switch (choice) {
				case 0:
					System.out.println("These are all details about the employee:");
					System.out.println(employee);
					// leaveProgram = false;
					break;
				case 1:
					System.out.println("This is the date of birth:");
					System.out.println(employee.getDateOfBirth());
					// leaveProgram = false;
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
					System.out.println(phoneString.substring(0, 3) + "-" + phoneString.substring(3, 6) + "-"
							+ phoneString.substring(6, 10));
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
					// Somehow get the statement to start over.
					break;
			}

			leaveProgram = false;

		}
	}
}