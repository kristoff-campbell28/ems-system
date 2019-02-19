package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import employmentSystem.*;
import enums.*;

public class Create {

	public static void create() throws FileNotFoundException, IOException {

		// Setting up all the variables.
		Scanner scanner = MainClass.scanner;
		GENDER g3;
		DEPARTMENT d3;
		JOBTITLE j3;
		USSTATES u3;
		MONTHS m3;
		LinkedHashMap<Integer, Employee> empHash = MainClass.empHash;
		Address address = new Address();
		Employee employee = new Employee();

		System.out.println("Enter an Employee ID: ");
		int employeeID = Helpers.validateInt(scanner);
		employee.setEmployeeID(employeeID);

		System.out.println("Enter an Email ID. It will be followed with @Collabera.com.");
		// Run a check to ensure that there's no spaces.
		String email = Helpers.validateExp(scanner, "[a-z]+@[a-z]+\\.[a-z]+");
		employee.setEmail(email);

		System.out.println("Enter a Job Title: ");
		System.out.println("Press 1 for Booker, 2 for Salaryman, 3 for Dog.");
		int jobTitle = Helpers.validateInt(scanner);

		if (jobTitle == 1) {
			j3 = JOBTITLE.BOOKER;
		} else if (jobTitle == 2) {
			j3 = JOBTITLE.SALARYMAN;
		} else if (jobTitle == 3) {
			j3 = JOBTITLE.DOG;
		} else {
			System.out.println("Print an actual option.");
			System.out.println("You are assigned the default job 'dog'.");
			j3 = JOBTITLE.DOG;
		}

		employee.setJobTitle(j3);

		System.out.println("What's your social security number? No hyphens, just a 9 digit number.");
		int ssn = Helpers.validateInt(scanner);
		employee.setSsn(ssn);

		System.out.println("What's your salary?");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		employee.setSalary(salary);

		System.out.println("What is your street number?");
		int streetNumber = Helpers.validateInt(scanner);
		address.setStreetNumber(streetNumber);

		System.out.println("What is your street name?");
		String streetName = scanner.nextLine();
		address.setStreetName(streetName);

		System.out.println("What is your city?");
		String city = scanner.nextLine();
		address.setCity(city);

		System.out.println("What is your state? Print the two letter abbreviation");
		String state = Helpers.validateExp(scanner, "[A-Z]{2}");
		String capState = state.toUpperCase();
		switch (capState) {
		case "AL":
			u3 = USSTATES.AL;
			break;
		case "AK":
			u3 = USSTATES.AK;
			break;
		case "AS":
			u3 = USSTATES.AS;
			break;
		case "AZ":
			u3 = USSTATES.AZ;
			break;
		case "AR":
			u3 = USSTATES.AR;
			break;
		case "CA":
			u3 = USSTATES.CA;
			break;
		case "CO":
			u3 = USSTATES.CO;
			break;
		case "CT":
			u3 = USSTATES.CT;
			break;
		case "DC":
			u3 = USSTATES.DC;
			break;
		case "DE":
			u3 = USSTATES.DE;
			break;
		case "FL":
			u3 = USSTATES.FL;
			break;
		case "FM":
			u3 = USSTATES.FM;
			break;
		case "GA":
			u3 = USSTATES.GA;
			break;
		case "GU":
			u3 = USSTATES.GU;
			break;
		case "HI":
			u3 = USSTATES.HI;
			break;
		case "ID":
			u3 = USSTATES.ID;
			break;
		case "IL":
			u3 = USSTATES.IL;
			break;
		case "IN":
			u3 = USSTATES.IN;
			break;
		case "IA":
			u3 = USSTATES.IA;
			break;
		case "KS":
			u3 = USSTATES.KS;
			break;
		case "KY":
			u3 = USSTATES.KY;
			break;
		case "LA":
			u3 = USSTATES.LA;
			break;
		case "ME":
			u3 = USSTATES.ME;
			break;
		case "MD":
			u3 = USSTATES.MD;
			break;
		case "MA":
			u3 = USSTATES.MA;
			break;
		case "MH":
			u3 = USSTATES.MH;
			break;
		case "MI":
			u3 = USSTATES.MI;
			break;
		case "MN":
			u3 = USSTATES.MN;
			break;
		case "MS":
			u3 = USSTATES.MS;
			break;
		case "MO":
			u3 = USSTATES.MO;
			break;
		case "MP":
			u3 = USSTATES.MP;
			break;
		case "MT":
			u3 = USSTATES.MT;
			break;
		case "NE":
			u3 = USSTATES.NE;
			break;
		case "NV":
			u3 = USSTATES.NV;
			break;
		case "NH":
			u3 = USSTATES.NH;
			break;
		case "NJ":
			u3 = USSTATES.NJ;
			break;
		case "NM":
			u3 = USSTATES.NM;
			break;
		case "NY":
			u3 = USSTATES.NY;
			break;
		case "NC":
			u3 = USSTATES.NC;
			break;
		case "ND":
			u3 = USSTATES.ND;
			break;
		case "OH":
			u3 = USSTATES.OH;
			break;
		case "OK":
			u3 = USSTATES.OK;
			break;
		case "OR":
			u3 = USSTATES.OR;
			break;
		case "PA":
			u3 = USSTATES.PA;
			break;
		case "PR":
			u3 = USSTATES.PR;
			break;
		case "PW":
			u3 = USSTATES.PW;
			break;
		case "RI":
			u3 = USSTATES.RI;
			break;
		case "SC":
			u3 = USSTATES.SC;
			break;
		case "SD":
			u3 = USSTATES.SD;
			break;
		case "TN":
			u3 = USSTATES.TN;
			break;
		case "TX":
			u3 = USSTATES.TX;
			break;
		case "UT":
			u3 = USSTATES.UT;
			break;
		case "VT":
			u3 = USSTATES.VT;
			break;
		case "VA":
			u3 = USSTATES.VA;
			break;
		case "VI":
			u3 = USSTATES.VI;
			break;
		case "WA":
			u3 = USSTATES.WA;
			break;
		case "WV":
			u3 = USSTATES.WV;
			break;
		case "WI":
			u3 = USSTATES.WI;
			break;
		case "WY":
			u3 = USSTATES.WY;
			break;

		default:
			System.out.println("You have failed to print a state.");
			System.out.println("You will be assigned the default value of New Jersey, ");
			System.out.println("where Collabera is located.");
			u3 = USSTATES.NJ;
		}
		address.setState(u3);

		System.out.println("What is your zip code?");
		int zipCode = Helpers.validateInt(scanner);
		address.setZipCode(zipCode);

		System.out.println("Enter first name.");
		String firstName = scanner.nextLine();

		System.out.println("Enter last name: ");
		String lastName = scanner.nextLine();

		String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
		employee.setFullName(fullName);
		System.out.println("Enter age: ");
		int age = Helpers.validateInt(scanner);
		employee.setAge(age);

		System.out.println("Enter phone number without hyphens.");
		long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		employee.setPhoneNumber(phoneNumber);

		System.out.println("Enter gender. Type m for male, f for female, o for other");
		String gender = scanner.nextLine();
		if (gender.equals("m")) {
			g3 = GENDER.MALE;
		} else if (gender.equals("f")) {
			g3 = GENDER.FEMALE;
		} else if (gender.equals("o")) {
			g3 = GENDER.OTHER;
		} else {
			System.out.println("You did not specify. Your gender will be labeled as other.");
			g3 = GENDER.OTHER;
		}
		employee.setGender(g3);

		// FIND ME FIND ME FIND ME!!!! AND WRITE DOWN EXCEPTIONS PROPERLY!!!!!

		System.out.println("Setting up today as the day " + fullName + " starts work.");
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		employee.setDateStartWork(date);

		System.out.println("Print month of birth. One word.");
		System.out.println("Print 1 for January, 2 for February, 3 for March, etc.");
		int birthMonth = Helpers.validateInt(scanner);
		switch (birthMonth) {
		case 1:
			m3 = MONTHS.JANUARY;
			break;
		case 2:
			m3 = MONTHS.FEBRUARY;
			break;
		case 3:
			m3 = MONTHS.MARCH;
			break;
		case 4:
			m3 = MONTHS.APRIL;
			break;
		case 5:
			m3 = MONTHS.MAY;
			break;
		case 6:
			m3 = MONTHS.JUNE;
			break;
		case 7:
			m3 = MONTHS.JULY;
			break;
		case 8:
			m3 = MONTHS.AUGUST;
			break;
		case 9:
			m3 = MONTHS.SEPTEMBER;
			break;
		case 10:
			m3 = MONTHS.OCTOBER;
			break;
		case 11:
			m3 = MONTHS.NOVEMBER;
			break;
		case 12:
			m3 = MONTHS.DECEMBER;
			break;
		default:
			System.out.println("You did not pick an option listed.");
			System.out.println("You will be assigned the default 'november");
			m3 = MONTHS.NOVEMBER;
			break;
		}

		System.out.println("Print day of " + m3.toString() + " you were born on.");
		int birthDay = Helpers.validateInt(scanner);
		// Check for day being less than 31.
		// Consider checking for September 31 if we have time.

		System.out.println("Print year of birth.");
		int birthYear = Helpers.validateInt(scanner);
		// Check that this is 4 digits long exactly.

		// Make the whole birthday.
		String birthDate = m3.toString().toLowerCase() + " " + birthDay + ", " + birthYear;
		employee.setDateOfBirth(birthDate);

		System.out.println("What department do you work in? Make this enum later. For now, one letter.");
		System.out.println("i for IT, m for Marketing, h for HR.");
		while (true) {
			String dept = scanner.nextLine();
			if (dept.equals("i")) {
				d3 = DEPARTMENT.IT;
				break;
			} 
			else if (dept.equals("m")) {
				d3 = DEPARTMENT.MARKETING;
				break;
			} else if (dept.equals("h")) {
				d3 = DEPARTMENT.HR;
				break;
			} 
			else {
				System.out.println("Do a real option.");
				d3 = DEPARTMENT.HR;
				break;
			} 
		}
		employee.setDept(d3);

		employee.setAddress(address);

		// Doing manager.
		// Ask if the employee is a manager.
		// Otherwise, the toString of the element will specify"Not a manager".
		
		System.out.println("Is the employee a manager?");
		System.out.println("Type 1 for yes, 2 for no.");
		int managing = Helpers.validateInt(scanner);
		switch (managing) {
		case 1:
			Manager empl = new Manager(employee);
			// Ask for number of managed employees.
			// Go through arraylist to find employees, and confirm working or not working  for.
			// Stop when number of employees is reached.
			System.out.println("How many employees do you want to work under the manager?");
			int amount = Helpers.validateInt(scanner); // Check that this is less than the amount of employees
														// available.
			if (amount > MainClass.keyValues.length) {
				for(int i = 0; i <= amount; i++) {
					System.out.println("Enter an employee ID");
					int id = Helpers.validateInt(scanner);
					empl.addEmployee(empHash.get(id));
				}
			}
			break;
		case 2:
			break;
		}

	}
}
