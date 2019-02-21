package employmentSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import functions.Create;
import functions.Delete;
import functions.Read;
import functions.Update;
import functions.WriteFromSystem;
import functions.WriteToSystem;

public class MainClass {

	
	public static Scanner scanner = new Scanner(System.in);
	public static LinkedHashMap<Integer, Employee> empHash = new LinkedHashMap<Integer, Employee>();
	public static int[] keyValues = new int[500];
	
	public static String fileName = "content.txt";


	public static void main(String[] args) throws IOException, Exception {
		
		
		//Find a way to print the array as strings. 
		
		
		
		//boolean usLiving = true;
		//Program over?
		boolean endProgram = true;
		//Do another program?
		boolean contForward;
		
		
		System.out.println("The system is only equipped to hold 500 people, as that is the current");
		System.out.println("maximum number of employees that Collabera can hire.");
		System.out.println("We will update the system as max employee count increases. \n \n \n");
	
		
			
		while (endProgram) {
			
			contForward = true;
			
			File file = new File(fileName);
			
			if (file.exists()) {
				
				empHash = (LinkedHashMap<Integer, Employee>) WriteFromSystem.deserializeObject(fileName);
				System.out.println("This is the current form of the employee HashMap:");
				
				if (empHash.isEmpty()) {
					System.out.println("Currently, the hashmap is empty.");
				}
				else {
					System.out.println(empHash);
				}
			}
			
		
			
			System.out.println();
			System.out.println();
			
			
				
			//scanner = new Scanner(System.in);
			
		
			System.out.println("-----------------------------------------------------------");

			System.out.println("WELCOME TO COLLABERA");

			System.out.println("-----------------------------------------------------------");

			System.out.println("Please Enjoy Our Employee Management System");

			System.out.println("-----------------------------------------------------------");

			System.out.println("[1]Create an Employee");

			System.out.println("[2]Retrieve Employee(s)");

			System.out.println("[3]Update an Employee");

			System.out.println("[4]Delete an Employee");
			
				int choice = scanner.nextInt();
				scanner.nextLine();

				if (choice == 1) {
					System.out.println("[1] Create");
					Create.create();
					
					
					
				}
					
				else if (choice == 2) {
					if (empHash.isEmpty()) {
						System.out.println("Sorry, this is empty. Put in content, then try again.");
					}
					else {
						System.out.println("Guess you're recalling.");
						Read.reader();
					}
					
					
					
				}
				else if (choice == 3) {
					if (empHash.isEmpty()) {
						System.out.println("Sorry, this is empty. Put in content, then try again.");
					}
					else {
						System.out.println("Guess you're updating.");
						Update.updater();
						
					}
					
					
				}
				else if (choice == 4) {
					
					if (empHash.isEmpty()) {
						System.out.println("Sorry, this is empty. Put in content, then try again.");
					}
					else {
						System.out.println("Guess you're deleting.");
						Delete.delete();
						
						System.out.println("Current number of employees in the system is " + empHash.size());
						
					}
					
					
					
				}
				else {
					System.out.println("Please choose a real output.");
					contForward = false;
				}

			
			
			
			
			
			
			while (contForward) {
				System.out.println("Would you like to continue? Press 1 for yes, 2 for no.");
				
				try {
					
					int contTask = scanner.nextInt();
					scanner.nextLine();
					
					
					if (contTask == 2) {
						System.out.println("Thank you for using this program.");
											
						contForward = false;
						endProgram = false; 
						
						
					}
					else if (contTask == 1) {
						System.out.println("Then please select your next option.");
						contForward = false;
						
					}
					else if (contTask != 1 && contTask != 2) {
						System.out.println("That's not an answer.");

					}
					
				} catch (InputMismatchException e) {



					do {

						System.out.println("Please Input a Valid Number: ");

						scanner.nextLine();

						if (scanner.hasNextInt()) 

							break;

					} while (scanner.hasNextLine());



				}
				
				
			}
			
		}
			
			
			
		
			
		
		
		
		
		scanner.close();

	}
	
	
	
	
	

}


//None of the scanner.whatever plan for the exception of nextInt.
//Is there a way to work around this?
//Or should everything be nextLine?


/*
* } catch (InputMismatchException e) {


do {

	System.out.println("Please Input a Valid Number: ");

	scanner.nextLine();

	if (scanner.hasNextInt())

		break;

} while (scanner.hasNextLine()); */


//while (usLiving) {
//
//	System.out.println("Do you live in the US? Press 1 for yes, 2 for no, 3 to quit.");
//	
//	
//	int choice = scanner.nextInt();
//	scanner.nextLine();
//	
//	if (choice == 1) {
//		System.out.println("Great to hear. \n");
//		usLiving = false;
//	}
//	
//	else if (choice == 2) {
//		System.out.println("Sorry, but this system only works for US addresses.");
//	}
//	else if (choice == 3) {
//		System.out.println("Thank you for using the EMS.");
//		System.exit(0);
//	}
//	
//	else {
//		System.out.println("That's not one of the choices.");
//	}
//	
//	
//}


//Live in US?
