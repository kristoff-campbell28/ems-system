package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;

import employmentSystem.*;
import enums.*;

public class Create {

	public static void create() throws FileNotFoundException, IOException {
		// Setting up all the variables.
		Scanner scanner = MainClass.scanner;
		GENDER g3 = null;
		DEPARTMENT d3 = null;
		JOBTITLE j3 = null;
		USSTATES u3 = null;
		MONTHS m3 = null;
		Employee employee = new Employee();
		LinkedHashMap<Integer, Employee> empHash = MainClass.empHash;
		Address address = new Address();
		boolean loop;

		System.out.println("Enter an Employee ID: ");
		int employeeID = Helpers.validateInt(scanner);
		employee.setEmployeeID(employeeID);

		System.out.println("Enter an Email ID.");
		// Run a check to ensure that there's no spaces.
		String email = Helpers.validateExp(scanner, MainClass.emailExp);
		employee.setEmail(email);

		System.out.println("Enter a Job Title: ");
		System.out.println("Press 1 for Secretary, 2 for Accountant, 3 for Sales.");

		loop = true;
		while (loop) {
			int jobTitle = Helpers.validateInt(scanner);
			if (jobTitle == 1) {
				j3 = JOBTITLE.SECRETARY;
				loop = false;
			} else if (jobTitle == 2) {
				j3 = JOBTITLE.ACCOUNTANT;
				loop = false;
			} else if (jobTitle == 3) {
				j3 = JOBTITLE.SALES;
				loop = false;
			} else {
				System.out.println("Print an actual option.");
			}
		}
		employee.setJobTitle(j3);
		System.out.println("What's your social security number? No hyphens, just a 9 digit number.");
		int ssn = Helpers.validateLength(scanner, 9);
		employee.setSsn(ssn);

		System.out.println("What's your salary?");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		employee.setSalary(salary);

		System.out.println("What is your street number?");
		int streetNumber = Helpers.validateInt(scanner);
		address.setStreetNumber(streetNumber);

		System.out.println("What is your street name?");
		String streetName = Helpers.validateSentence(scanner, MainClass.defaultExp);
		address.setStreetName(streetName);

		System.out.println("What is your city?");
		String city =  Helpers.validateSentence(scanner, MainClass.defaultExp);
		address.setCity(city);

		System.out.println("What is your state? Print the two letter abbreviation");
		loop = true;
		do {
			String state = Helpers.validateExp(scanner, MainClass.stateExp);
			String capState = state.toUpperCase();
			switch (capState) {
			case "AL":
				u3 = USSTATES.AL;
				loop = false;
				break;
			case "AK":
				u3 = USSTATES.AK;
				loop = false;
				break;
			case "AS":
				u3 = USSTATES.AS;
				loop = false;
				break;
			case "AZ":
				u3 = USSTATES.AZ;
				loop = false;
				break;
			case "AR":
				u3 = USSTATES.AR;
				loop = false;
				break;
			case "CA":
				u3 = USSTATES.CA;
				loop = false;
				break;
			case "CO":
				u3 = USSTATES.CO;
				loop = false;
				break;
			case "CT":
				u3 = USSTATES.CT;
				loop = false;
				break;
			case "DC":
				u3 = USSTATES.DC;
				loop = false;
				break;
			case "DE":
				u3 = USSTATES.DE;
				loop = false;
				break;
			case "FL":
				u3 = USSTATES.FL;
				loop = false;
				break;
			case "FM":
				u3 = USSTATES.FM;
				loop = false;
				break;
			case "GA":
				u3 = USSTATES.GA;
				loop = false;
				break;
			case "GU":
				u3 = USSTATES.GU;
				loop = false;
				break;
			case "HI":
				u3 = USSTATES.HI;
				loop = false;
				break;
			case "ID":
				u3 = USSTATES.ID;
				loop = false;
				break;
			case "IL":
				u3 = USSTATES.IL;
				loop = false;
				break;
			case "IN":
				u3 = USSTATES.IN;
				break;
			case "IA":
				u3 = USSTATES.IA;
				loop = false;
				break;
			case "KS":
				u3 = USSTATES.KS;
				loop = false;
				break;
			case "KY":
				u3 = USSTATES.KY;
				loop = false;
				break;
			case "LA":
				u3 = USSTATES.LA;
				loop = false;
				break;
			case "ME":
				u3 = USSTATES.ME;
				loop = false;
				break;
			case "MD":
				u3 = USSTATES.MD;
				loop = false;
				break;
			case "MA":
				u3 = USSTATES.MA;
				loop = false;
				break;
			case "MH":
				u3 = USSTATES.MH;
				loop = false;
				break;
			case "MI":
				u3 = USSTATES.MI;
				loop = false;
				break;
			case "MN":
				u3 = USSTATES.MN;
				loop = false;
				break;
			case "MS":
				u3 = USSTATES.MS;
				loop = false;
				break;
			case "MO":
				u3 = USSTATES.MO;
				loop = false;
				break;
			case "MP":
				u3 = USSTATES.MP;
				loop = false;
				break;
			case "MT":
				u3 = USSTATES.MT;
				loop = false;
				break;
			case "NE":
				u3 = USSTATES.NE;
				loop = false;
				break;
			case "NV":
				u3 = USSTATES.NV;
				loop = false;
				break;
			case "NH":
				u3 = USSTATES.NH;
				loop = false;
				break;
			case "NJ":
				u3 = USSTATES.NJ;
				loop = false;
				break;
			case "NM":
				u3 = USSTATES.NM;
				loop = false;
				break;
			case "NY":
				u3 = USSTATES.NY;
				loop = false;
				break;
			case "NC":
				u3 = USSTATES.NC;
				loop = false;
				break;
			case "ND":
				u3 = USSTATES.ND;
				loop = false;
				break;
			case "OH":
				u3 = USSTATES.OH;
				loop = false;
				break;
			case "OK":
				u3 = USSTATES.OK;
				loop = false;
				break;
			case "OR":
				u3 = USSTATES.OR;
				loop = false;
				break;
			case "PA":
				u3 = USSTATES.PA;
				loop = false;
				break;
			case "PR":
				u3 = USSTATES.PR;
				loop = false;
				break;
			case "PW":
				u3 = USSTATES.PW;
				loop = false;
				break;
			case "RI":
				u3 = USSTATES.RI;
				loop = false;
				break;
			case "SC":
				u3 = USSTATES.SC;
				loop = false;
				break;
			case "SD":
				u3 = USSTATES.SD;
				loop = false;
				break;
			case "TN":
				u3 = USSTATES.TN;
				loop = false;
				break;
			case "TX":
				u3 = USSTATES.TX;
				loop = false;
				break;
			case "UT":
				u3 = USSTATES.UT;
				loop = false;
				break;
			case "VT":
				u3 = USSTATES.VT;
				loop = false;
				break;
			case "VA":
				u3 = USSTATES.VA;
				loop = false;
				break;
			case "VI":
				u3 = USSTATES.VI;
				loop = false;
				break;
			case "WA":
				u3 = USSTATES.WA;
				loop = false;
				break;
			case "WV":
				u3 = USSTATES.WV;
				loop = false;
				break;
			case "WI":
				u3 = USSTATES.WI;
				loop = false;
				break;
			case "WY":
				u3 = USSTATES.WY;
				loop = false;
				break;
			default:
				System.out.println("You have failed to print a state.");
			}
		} while (loop);
		address.setState(u3);
		
		System.out.println("What is your zip code?");
		int zipCode = Helpers.validateLength(scanner, 5);
		address.setZipCode(zipCode);

		System.out.println("Enter first name.");
		String firstName = Helpers.validateExp(scanner, MainClass.noSpaceExp);

		System.out.println("Enter last name: ");
		String lastName =  Helpers.validateExp(scanner, MainClass.noSpaceExp);

		String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
		employee.setFullName(fullName);

		System.out.println("Enter phone number without hyphens.");
		long phoneNumber = Helpers.validateLongLength(scanner, 10);
		employee.setPhoneNumber(phoneNumber);

		System.out.println("Enter gender. Type m for male, f for female, o for other");
		loop = true;
		while (loop) {
			String gender = scanner.nextLine();
			if (gender.equals("m")) {
				g3 = GENDER.MALE;
				loop = false;
			} else if (gender.equals("f")) {
				g3 = GENDER.FEMALE;
				loop = false;
			} else if (gender.equals("o")) {
				g3 = GENDER.OTHER;
				loop = false;
			} else {
				System.out.println("Invalid input");
			}
		}
		employee.setGender(g3);

		// FIND ME FIND ME FIND ME!!!! AND WRITE DOWN EXCEPTIONS PROPERLY!!!!!

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		employee.setDateStartWork(date);

		System.out.println("Print month of birth. One word.");
		System.out.println("Print 1 for January, 2 for February, 3 for March, etc.");

		loop = true;
		while (loop) {
			int birthMonth = Helpers.validateInt(scanner);
			switch (birthMonth) {
			case 1:
				m3 = MONTHS.JANUARY;
				loop = false;
				break;
			case 2:
				m3 = MONTHS.FEBRUARY;
				loop = false;
				break;
			case 3:
				m3 = MONTHS.MARCH;
				loop = false;
				break;
			case 4:
				m3 = MONTHS.APRIL;
				loop = false;
				break;
			case 5:
				m3 = MONTHS.MAY;
				loop = false;
				break;
			case 6:
				m3 = MONTHS.JUNE;
				loop = false;
				break;
			case 7:
				m3 = MONTHS.JULY;
				loop = false;
				break;
			case 8:
				m3 = MONTHS.AUGUST;
				loop = false;
				break;
			case 9:
				m3 = MONTHS.SEPTEMBER;
				loop = false;
				break;
			case 10:
				m3 = MONTHS.OCTOBER;
				loop = false;
				break;
			case 11:
				m3 = MONTHS.NOVEMBER;
				loop = false;
				break;
			case 12:
				m3 = MONTHS.DECEMBER;
				loop = false;
				break;
			default:
				System.out.println("You did not pick an option listed.");
			}
		}

		System.out.println("Print day of " + m3.toString() + " you were born on.");
		int birthDay = Helpers.validateInt(scanner);
		// Check for day being less than 31.
		// Consider checking for September 31 if we have time.

		System.out.println("Print year of birth.");
		int birthYear = Helpers.validateLength(scanner, 4);
		// Check that this is 4 digits long exactly.

		// Make the whole birthday.
		String birthDate = m3.toString().toLowerCase() + " " + birthDay + ", " + birthYear;
		employee.setDateOfBirth(birthDate);

		System.out.println("What department do you work in? Make this enum later. For now, one letter.");
		System.out.println("i for IT, m for Marketing, h for HR.");
		loop = true;
		while (loop) {
			String dept = scanner.nextLine();
			if (dept.equals("i")) {
				d3 = DEPARTMENT.IT;
				loop = false;
			} else if (dept.equals("m")) {
				d3 = DEPARTMENT.MARKETING;
				loop = false;
			} else if (dept.equals("h")) {
				d3 = DEPARTMENT.HR;
				loop = false;
			} else {
				System.out.println("Do a real option.");
				d3 = DEPARTMENT.HR;
				continue;
			} 
		}
		employee.setDept(d3);

		employee.setAddress(address);
		// Doing manager.
		// Ask if the employee is a manager.
		// Otherwise, the toString of the element will specify"Not a manager".

		System.out.println("Is the employee a manager?");
		System.out.println("Type 1 for yes, 2 for no.");
		loop = true;
		while (loop) {
			int managing = Helpers.validateInt(scanner);
			switch (managing) {
			case 1:
				Manager manager = new Manager(employee);
				// Ask for number of managed employees.
				// Go through array list to find employees, and confirm working or not working
				// for.
				// Stop when number of employees is reached.
				System.out.println("How many employees do you want to work under the manager?");
				while (loop) {
					int amount = Helpers.validateInt(scanner); // Check that this is less than the amount of employees available.
					if (amount < MainClass.keyValues.length) {
						for (int i = 0; i <= amount; i++) {
							System.out.println("Enter an employee ID");
							int id = Helpers.validateInt(scanner);
							manager.addEmployee(empHash.get(id));
							System.out.println("Employee added.");
						}
						loop = false;
					} 
					else {
						System.out.println("Employee maximum exceeded. Please enter a different amount.");
					} 
				}
				empHash.put(manager.getEmployeeID(), manager);
				loop = false;
				break;
			case 2:
				empHash.put(employee.getEmployeeID(), employee);
				loop = false;
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
		}
		Helpers.serializeObject(empHash, MainClass.fileName);
	}
}
