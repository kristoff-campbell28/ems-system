package functions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
//import employmentSystem.Manager;
import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;
import enums.USSTATES;

public class Create {

	public static void create() {

		Scanner scanner = MainClass.scanner;
		GENDER g3;
		DEPARTMENT d3;
		JOBTITLE j3;
		USSTATES u3;
		LinkedHashMap<Integer, Employee> empHash = MainClass.empHash;
		Address address = new Address();
		Employee employee = new Employee();

		System.out.println("What's your employee ID? Have some range limitations later.");
		int employeeID = scanner.nextInt();
		scanner.nextLine();
		employee.setEmployeeID(employeeID);

		System.out.println("Everyone's email will end with @Collabera.com. But you can choose what goes before the @.");
		System.out.println("Please type the alphanumeric combination you'd like before the @.");
		System.out.println("NO SPACES!");
		// Run a check to ensure that there's no spaces.
		String email = scanner.next();
		employee.setEmail(email);

		System.out.println("What's your job title?");
		System.out.println("Press 1 for Booker, 2 for Salaryman, 3 for Dog.");
		int jobTitle = scanner.nextInt();
		scanner.nextLine();

		if (jobTitle == 1) {
			j3 = JOBTITLE.BOOKER;
		} else if (jobTitle == 2) {
			j3 = JOBTITLE.SALARYMAN;
		} else if (jobTitle == 3) {
			j3 = JOBTITLE.DOG;
		} else {
			System.out.println("Print an actual option.");
			j3 = JOBTITLE.DOG;
			// Find an actual way to loop here.
		}

		employee.setJobTitle(j3);

		System.out.println("What's your social security number? No hyphens, just a 9 digit number.");
		int ssn = scanner.nextInt();
		scanner.nextLine();
		employee.setSsn(ssn);

		System.out.println("What's your salary?");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		employee.setSalary(salary);

		System.out.println("What is your street number?");
		int streetNumber = scanner.nextInt();
		scanner.nextLine();
		address.setStreetNumber(streetNumber);

		System.out.println("What is your street name?");
		String streetName = scanner.nextLine();
		address.setStreetName(streetName);

		System.out.println("What is your city?");
		String city = scanner.nextLine();
		address.setCity(city);

		System.out.println("What is your state? Print the two letter abbreviation");
		String state = scanner.next();
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
			System.out.println("Please print a real state.");
			// Do this loop over again.
			u3 = USSTATES.MI;
		}
		address.setState(u3);

		System.out.println("What is your zip code?");
		int zipCode = scanner.nextInt();
		scanner.nextLine();
		address.setZipCode(zipCode);

		// get the name.
		System.out.println("Enter first name.");
		String firstName = scanner.next();
		// Do some kind of check to ensure that this is one word.
		// Then, create a new string where the first letter alone is capitalized.

		System.out.println("Enter last name: ");
		String lastName = scanner.next();
		// Do some kind of check to ensure that this is one word.
		// Then, create a new string where the first letter alone is capitalized.

		String fullName = firstName + " " + lastName;
		employee.setFullName(fullName);

		// Get age.
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		employee.setAge(age);

		// Get phone number
		System.out.println("Enter phone number without hyphens.");
		long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		employee.setPhoneNumber(phoneNumber);

		// Get the gender.
		System.out.println("Enter gender. Type m for male, f for female, o for other");
		String gender = scanner.next();
		if (gender.equals("m")) {
			g3 = GENDER.MALE;
		} else if (gender.equals("f")) {
			g3 = GENDER.FEMALE;
		} else if (gender.equals("o")) {
			g3 = GENDER.OTHER;
		} else {
			System.out.println("Print a gender, meanhead.");
			g3 = GENDER.OTHER;
			// Find an actual way to loop here.
		}
		employee.setGender(g3);

		System.out.println("Setting up today as the day " + fullName + " starts work.");
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		employee.setDateStartWork(date);

		// Enum later? Probably. List choices.
		System.out.println("Print month of birth. One word.");
		String birthMonth = scanner.next();

		System.out.println("Print day of " + birthMonth + " you were born on.");
		int birthDay = scanner.nextInt();
		scanner.nextLine();
		// Check for day being less than 31.
		// Consider checking for september 31 if we have time.

		System.out.println("Print year of birth.");
		int birthYear = scanner.nextInt();
		scanner.nextLine();
		// Check that this is 4 digits long exactly.

		// Make the whole birthday.
		String birthDate = birthMonth + " " + birthDay + ", " + birthYear;
		employee.setDateOfBirth(birthDate);

		System.out.println("What department do you work in? Make this enum later. For now, one letter.");
		System.out.println("i for IT, m for Marketing, h for HR.");
		String dept = scanner.next();
		if (dept.equals("i")) {
			d3 = DEPARTMENT.IT;

		} else if (dept.equals("m")) {
			d3 = DEPARTMENT.MARKETING;
		} else if (dept.equals("h")) {
			d3 = DEPARTMENT.HR;
		} else {
			System.out.println("Do a real option.");
			d3 = DEPARTMENT.HR;

		}
		employee.setDept(d3);

		employee.setAddress(address);

		/*
		 * //Doing manager.
		 * 
		 * System.out.println("Is the employee a manager?");
		 * System.out.println("Type 1 for yes, 2 for no."); int managing =
		 * scanner.nextInt(); scanner.nextLine(); if (managing == 1) { Manager manager =
		 * new Manager(); //manager = employee;
		 * 
		 * //Ask for number of managed employees. //Go through arraylist to find
		 * employees, and confirm working or not working for. //Stop when number of
		 * employees is reached.
		 * 
		 * }
		 * 
		 * 
		 * //Ask if the employee is a manager. //Otherwise, the toString of the element
		 * will specify "Not a manager".
		 * 
		 */

		// Doing manager.

		// Setting values
		empHash.put(employee.getEmployeeID(), employee);
		int listLength = empHash.size();
		MainClass.keyValues[listLength] = employee.getEmployeeID();

		System.out.println(empHash);

	}
}
