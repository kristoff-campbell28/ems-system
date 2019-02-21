package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import employmentSystem.Employee;
import employmentSystem.MainClass;

public class Delete {

	
	public static void delete() throws FileNotFoundException, IOException {
		
		Scanner scanner = MainClass.scanner;
		
		System.out.println("Here are the possible IDs to delete:");
		
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
		
				
		System.out.println("Employee with name " + MainClass.empHash.get(updateID).getFullName() 
		+ " has been deleted.");
		MainClass.empHash.remove(updateID);
			
			
		WriteToSystem.serializeObject(MainClass.empHash, "content.txt");
			
		
	
	
	}
	
}
