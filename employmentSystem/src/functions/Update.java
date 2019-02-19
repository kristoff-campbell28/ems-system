package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;
import enums.USSTATES;

public class Update {

	public static void updater() throws FileNotFoundException, IOException {

		/*
		 * FIND THE PROBLEMS!!!! This includes email.
		 */

		Scanner scanner = MainClass.scanner;
		Address address = new Address();
		USSTATES u3;

		System.out.println("Your choices are as follows: ");

		for (int key : MainClass.empHash.keySet()) {
			System.out.println(key);
		}

		System.out.println("Please enter the ID of the employee you wish to change some aspect of.");

		int employeeID = Helpers.validateInt(scanner);

		boolean options = true;

		while (options) {
			if (MainClass.empHash.containsKey(employeeID)) {
				Employee employee = MainClass.empHash.get(employeeID);

				System.out.println("Here are all the details of the employee with ID " + employeeID + ": ");
				System.out.println(employee);
				System.out.println("What detail would you like to modify?");
				System.out.println("Please note that, due to safety reasons, "
						+ "we only allow one item to be modified at a time.");

				System.out.println("Press 0 for changing the employee ID.");
				System.out.println("Press 1 for changing the date of birth.");
				System.out.println("Press 2 for changing the department worked in.");
				System.out.println("Press 3 for changing the email.");
				System.out.println("Press 4 for changing the job title.");
				System.out.println("Press 5 for changing the social security number.");
				System.out.println("Press 6 for changing the salary.");
				System.out.println("Press 7 for changing the full name.");
				System.out.println("Press 8 for changing the phone number.");
				System.out.println("Press 9 for changing all details in their address.");
				System.out.println("Press 10 for changing the gender.");
				System.out.println("Press 11 for changing the age.");
				int change = Helpers.validateInt(scanner);

				switch (change) {
				case 0:
					System.out.println("This is the old employee ID: ");
					System.out.println(employee.getEmployeeID());
					System.out.println("Enter the new employee ID.");
					int newID = Helpers.validateInt(scanner);
					employee.setEmployeeID(newID);
					System.out.println("The employee ID has been changed to " + employee.getEmployeeID());
					break;
				case 1:
					System.out.println("This is the old date of birth: ");
					System.out.println(employee.getDateOfBirth());
					System.out.println("Enter the new date of birth.");
					String newBirth = scanner.nextLine();
					employee.setDateOfBirth(newBirth);
					System.out.println("The date of birth has been changed to " + employee.getDateOfBirth());
					break;
				case 2:
					System.out.println("This is the old department worked in: ");
					System.out.println(employee.getDept());
					System.out.println("Enter the new department.");
					System.out.println("Options: 1 for IT, 2 for Marketing, 3 for HR.");
					int newDept = Helpers.validateInt(scanner);
					DEPARTMENT d3;
					if (newDept == 1) {
						d3 = DEPARTMENT.IT;
					} else if (newDept == 2) {
						d3 = DEPARTMENT.MARKETING;
					} else if (newDept == 3) {
						d3 = DEPARTMENT.HR;
					} else {
						System.out.println("This isn't a choice. Try again");
						d3 = DEPARTMENT.IT;
						// Find an actual way to loop here.
					}
					employee.setDept(d3);
					System.out.println("The department worked in has been changed to " + employee.getDept());
					break;
				case 3:
					System.out.println("This is the old email: ");
					System.out.println(employee.getEmail() + "@Collabera.com");
					System.out.println("Enter the new email.");
					String newEmail = Helpers.validateExp(scanner, MainClass.emailExp);
					System.out.println("The email has been changed to " + employee.getEmail() + "@Collabera.com");
					break;
				case 4:
					System.out.println("This is the old job title: ");
					System.out.println(employee.getJobTitle());
					System.out.println("Enter the new job title.");
					System.out.println("Press 1 for Booker, 2 for Salaryman, 3 for Dog.");
					int jobTitle = Helpers.validateInt(scanner);
					JOBTITLE j3;
					if (jobTitle == 1) {
						j3 = JOBTITLE.BOOKER;
					} else if (jobTitle == 2) {
						j3 = JOBTITLE.SALARYMAN;
					} else if (jobTitle == 3) {
						j3 = JOBTITLE.DOG;
					} else {
						System.out.println("Print an actual option.");
						System.out.println("");
						j3 = JOBTITLE.DOG;
						// Find an actual way to loop here.
					}

					employee.setJobTitle(j3);
					System.out.println("The job has been changed to " + employee.getJobTitle());
					break;
				case 5:
					System.out.println("This is the old social security number: ");

					String ssnOld = Integer.toString(employee.getSsn());
					System.out.println(
							ssnOld.substring(0, 3) + "-" + ssnOld.substring(3, 5) + "-" + ssnOld.substring(5, 8));
					System.out.println("Enter the new social security number.");
					int newSsn = Helpers.validateLength(scanner, 9);
					employee.setSsn(newSsn);
					String newSsnString = Integer.toString(newSsn);
					System.out.println("The social security number has been changed to ");
					System.out.println(newSsnString.substring(0, 3) + "-" + newSsnString.substring(3, 5) + "-"
							+ newSsnString.substring(5, 8));
					break;
				case 6:
					// FIX THIS!!!!
					System.out.println("This is the old salary: ");
					System.out.print("$");
					System.out.printf("%.2f", employee.getSalary());
					System.out.println();
					System.out.println("Enter the new salary.");
					double newSalary = Helpers.validateInt(scanner);
					employee.setSalary(newSalary);
					System.out.print("The salary has been changed to: $");
					System.out.printf("%.2f", employee.getSalary());
					System.out.println();
					break;
				case 7:
					System.out.println("This is the old full name: ");
					System.out.println(employee.getFullName());
					System.out.println("Enter the new first name.");
					String newFirst = scanner.next();
					System.out.println("Enter the new last name.");
					String newLast = scanner.next();
					String newFullName = newFirst.toUpperCase() + " " + newLast.toUpperCase();
					employee.setFullName(newFullName);
					System.out.println("The employee's name has been changed to " + employee.getFullName());
					break;
				case 8:
					System.out.println("This is the old phone number: ");
					long phoneNumber = employee.getPhoneNumber();
					System.out.println(Double.toString(phoneNumber).substring(0, 3) + "-"
							+ Double.toString(phoneNumber).substring(3, 6) + "-"
							+ Double.toString(phoneNumber).substring(6, 9));
					System.out.println("Enter the new phone number.");
					long newPhone =Helpers.validateLongLength(scanner, 10);
					employee.setPhoneNumber(newPhone);
					System.out.println("The phone number has been changed to ");
					System.out.println(Long.toString(newPhone).substring(0, 3) + "-"
							+ Long.toString(newPhone).substring(3, 6) + "-" + Long.toString(newPhone).substring(6, 9));
					break;
				case 9:
					System.out.println("This is the old address: ");
					System.out.println(employee.getAddress().toString());

					System.out.println("Enter the new address by following the steps below:");
					System.out.println("Enter the street number.");
					int newStreetNumber = Helpers.validateInt(scanner);
					System.out.println("Enter the street name.");
					String newStreetName = scanner.nextLine();
					System.out.println("Enter the city name.");
					String newCityName = scanner.nextLine();
					System.out.println("Enter the new state. Still 2 letters.");
					String newState = Helpers.validateExp(scanner, MainClass.stateExp);
					switch (newState) {

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
						System.out.println("You have not selected a valid input.");
						System.out.println("Thus, we must assume that you live in New Jersey,");
						System.out.println("the place where this Collabera office is located.");
						u3 = USSTATES.NJ;
						// Later fix this to go through the switch statement again.
						break;

					}
					System.out.println("Enter the new zip code.");
					int newZip = Helpers.validateLength(scanner, 5);

					address.setStreetNumber(newStreetNumber);
					address.setStreetName(newStreetName);
					address.setCity(newCityName);
					address.setState(u3);
					address.setZipCode(newZip);

					employee.setAddress(address);

					System.out.println("The address has been changed to: ");
					System.out.println(employee.getAddress().toString());
					break;

				case 10:
					GENDER g3;
					System.out.println("This is the old gender: ");
					System.out.println(employee.getGender());
					System.out.println("Enter the new gender.");
					System.out.println("1 for male, 2 for female, 3 for other.");
					int newGender = Helpers.validateInt(scanner);
					if (newGender == 1) {
						g3 = GENDER.MALE;
					} else if (newGender == 2) {
						g3 = GENDER.FEMALE;
					} else if (newGender == 3) {
						g3 = GENDER.OTHER;
					} else {
						System.out.println("You did not pick a gender.");
						System.out.println("We will assume that you identify as 'other'.");
						g3 = GENDER.OTHER;
						// Find an actual way to loop here.
					}

					employee.setGender(g3);
					System.out.println("The gender has been changed to " + g3 + ". ");
					break;
				default:
					System.out.println("Please print an actual option.");
					updater();
					break;
				}
				options = false;
			} else {
				System.out.println("Negative. Please enter a valid ID.");
			}
		}
		Helpers.serializeObject(MainClass.empHash, MainClass.fileName);
	}
}
