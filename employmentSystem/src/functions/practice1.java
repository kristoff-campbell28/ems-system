package functions;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		practice1 demo = new practice1();
		demo.validatePositive();
		
	}
	
	private void validatePositive() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		//Only letters and spaces. 
//		String str; 
//		
//		do {
//			System.out.println("Print the emailID.");
//			str = scanner.next();
//			
//			if (!str.matches("[a-zA-Z]*")) {
//				System.out.println("No spaces or non-alphanumeric characters.");
//			}
//	
//		} while (!str.matches("[a-zA-Z0-9]*"));
//		
//		System.out.println("The email is " + str + "@Collabera.com.");
		
		
		
//		//Salary. For all ints.
//		
//		int salary;
//		
//		do {
//			System.out.println("Please enter a salary. Max is int value.");
//			while (!scanner.hasNextInt()) {
//				
//				System.out.println("Please print an actual number or reasonable number.");
//				scanner.nextLine();
//			}
//			salary = scanner.nextInt();
//			
//			
//			
//			
//		} while ((salary < 0));
//				
//		System.out.println("Duh" + salary);
		
		//Do any enum.
		
//		String choice;
//		do {
//			System.out.println("Print your job choice. 1, 2 or 3.");
//			choice = scanner.next();
//			
//			if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"))
//				System.out.println("Please pick one of the three choices. Nothing else.");
//		}
//		
//		while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
//		
//		System.out.println("Your choice is " + choice + ". ");
		
		
		//Check if something is ONLY letters and numbers.
		
		String str; 
		
		do {
			System.out.println("Print the emailID.");
			str = scanner.nextLine();
		
			if (!str.matches("[a-zA-Z0-9]")) {
				System.out.println("No spaces or non-alphanumeric characters.");
			}
		} while (!str.matches("[a-zA-Z0-9]*"));
		
		System.out.println("The email is " + str + "@Collabera.com.");
		
		
//		String str; 
//		
//		do {
//			System.out.println("Print the emailID.");
//			str = scanner.nextLine();
//		
//			if (!str.matches("[a-zA-Z0-9]")) {
//				System.out.println("No spaces or non-alphanumeric characters.");
//			}
//		} while (!str.matches("[a-zA-Z0-9]*"));
//		
//		System.out.println("The email is " + str + "@Collabera.com.");
		
		
		//Check that a number is X digits long. In this case, 5. EmpID, SSN, 
		
//		int number;
//		
//		do {
//			System.out.println("Please enter 5 digit zip code.");
//			while (!scanner.hasNextInt()) {
//				
//				System.out.println("Please print an integer.");
//				scanner.next();
//			}
//			number = scanner.nextInt();
//			
//			
//			
//			
//		} while (Integer.toString(number).length() != 5);
//		
//		System.out.printf("You have entered a positive number %d.\n", number);
		 
		
		scanner.close();
		
	}

	
	
}
	
	