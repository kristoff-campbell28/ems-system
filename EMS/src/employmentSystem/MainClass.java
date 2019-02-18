package employmentSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import functions.Create;
import functions.Delete;
import functions.Read;
import functions.Update;

public class MainClass {

	/*
	 * public static void serializeObject(Object object, String fileName) throws
	 * FileNotFoundException, IOException {
	 * 
	 * ObjectOutputStream outStream = new ObjectOutputStream(new
	 * FileOutputStream(new File(fileName)));
	 * 
	 * outStream.writeObject(object);
	 * 
	 * outStream.close();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public static Object deserializeObject(String fileName)
	 * 
	 * throws FileNotFoundException, IOException, ClassNotFoundException {
	 * 
	 * ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(new
	 * File(fileName)));
	 * 
	 * Object object = inStream.readObject();
	 * 
	 * inStream.close();
	 * 
	 * return object;
	 * 
	 * }
	 */

	public static Scanner scanner = new Scanner(System.in);
	// if x files exists:
	// retrieve it and have it exist here.
	// Make sure that this outside file is constantly referred to.
	public static LinkedHashMap<Integer, Employee> empHash = new LinkedHashMap<Integer, Employee>();
	public static int[] keyValues = new int[500];

	public static void main(String[] args) {

		// None of the scanner.whatever plan for the exception of nextInt.
		// Is there a way to work around this?
		// Or should everything be nextLine?

		// Live in US?
		boolean usLiving = true;
		// Program over?
		boolean endProgram = true;
		// Do another program?
		boolean contForward;
		//

		System.out.println("The system is only equipped to hold 500 people, as that is the current");
		System.out.println("maximum number of employees that Collabera can hire.");
		System.out.println("We will update the system as max employee count increases. \n \n \n");

		while (usLiving) {

			System.out.println("Do you live in the US? Press 1 for yes, 2 for no, 3 to quit.");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.println("Great to hear. \n");
				usLiving = false;
			}

			else if (choice == 2) {
				System.out.println("Sorry, but this system only works for US addresses.");
			} else if (choice == 3) {
				System.out.println("Thank you for using the EMS.");
				System.exit(0);
			}

			else {
				System.out.println("That's not one of the choices.");
			}

		}

		// USE DATABASE FOR THE RECOLLECTION METHOD!!!!!!!

		while (endProgram) {
			contForward = true;
			System.out.println("Please select the type of system you wish to use.");
			System.out.println("1 for create, 2 for recall, 3 for update, 4 for destroy.");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.println("Guess you're creating.");
				Create.create();
			}
			// Look at this if you want to see values.
//				for (int i = 0; i < keyValues.length; i++) {
//					if (keyValues[i] != 0) {
//						Employee emp = empHash.get(keyValues[i]);
//						System.out.println(emp);
//					}
//				}
			else if (choice == 2) {
				// have not made method yet.
				if (empHash.isEmpty()) {
					System.out.println("Sorry, this is empty. Put in content, then try again.");
					contForward = false;
				} else {
					System.out.println("Guess you're recalling.");
					Read.reader();
				}

			} else if (choice == 3) {
				// Have not made method yet.
				if (empHash.isEmpty()) {
					System.out.println("Sorry, this is empty. Put in content, then try again.");
					contForward = false;
				} else {
					System.out.println("Guess you're updating.");
					Update.updater();
				}

			} else if (choice == 4) {

				if (empHash.isEmpty()) {
					System.out.println("Sorry, this is empty. Put in content, then try again.");
					contForward = false;
				} else {
					System.out.println("Guess you're deleting.");
					Delete.delete();

					System.out.println(empHash.size());
				}

			} else {
				System.out.println("Please choose a real output.");
				contForward = false;
			}

			while (contForward) {
				System.out.println("Would you like to continue? Press 1 for yes, 2 for no.");

				int contTask = scanner.nextInt();
				scanner.nextLine();

				if (contTask == 2) {
					System.out.println("Thank you for using this program.");
					contForward = false;
					endProgram = false;

				} else if (contTask == 1) {
					System.out.println("Then please select your next option.");
					contForward = false;
				} else if (contTask != 1 && contTask != 2) {
					System.out.println("That's not an answer.");

				}
			}

		}

		// Try to print the employee value, somehow.

//		for (Employee emp : empHash.values()) {
//			System.out.println("First employee is " + emp.toString());
//		}

		// System.out.println(empHash);

		// CRUD = create, recall, update, delete.

		/*
		 * //Template Employee 1. Employee employee1 = new Employee(); Person person1 =
		 * new Person(); Address addr1 = new Address();
		 * employee1.setDateOfBirth("September"); employee1.setDept(DEPARTMENT.IT);
		 * employee1.setEmployeeID(11111); employee1.setEmail("JPaul49@gmail.com");
		 * employee1.setJobTitle("Novelist"); employee1.setSsn(111111111);
		 * employee1.setSalary(280); person1.setFirstName("Joshua");
		 * person1.setLastName("Paul"); person1.setFullName("Joshii Piil");
		 * person1.setGender(GENDER.MALE); person1.setAge(25);
		 * person1.setPhoneNumber(484238); person1.setDate("Today");
		 * addr1.setStreetNumber(345); addr1.setStreetName("Bowman");
		 * addr1.setState("PA"); addr1.setCity("Merion"); addr1.setZipCode(19066);
		 * 
		 * 
		 * employee1.setAddress(addr1); employee1.setPerson(person1);
		 * 
		 * Employee employee2 = new Employee(); Person person2 = new Person(); Address
		 * addr2 = new Address(); employee2.setDateOfBirth("January");
		 * employee2.setDept(DEPARTMENT.IT); employee2.setEmployeeID(22222);
		 * employee2.setEmail("JohnDoe@gmail.com"); employee2.setJobTitle("Therapist");
		 * employee2.setSsn(22322332); employee2.setSalary(900);
		 * person2.setFirstName("Brenda"); person2.setLastName("Viridian");
		 * 
		 * person2.setGender(GENDER.FEMALE); person2.setAge(10);
		 * person2.setPhoneNumber(8675309); person2.setDate("Yesterday");
		 * addr2.setStreetNumber(666); addr2.setStreetName("Devil");
		 * addr2.setState("NJ"); addr2.setCity("Naljo"); addr2.setZipCode(22299);
		 * 
		 * 
		 * employee2.setAddress(addr2); employee2.setPerson(person2);
		 * 
		 * 
		 * empHash.put(employee1.getEmployeeID(), employee1);
		 * 
		 * empHash.put(employee2.getEmployeeID(), employee2);
		 */

		/*
		 * The MANAGER bits are here.
		 */

		// No there isn't. No manager until we create array of employees that exists in
		// CRUD.

		scanner.close();

	}

}
