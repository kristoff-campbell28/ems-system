package functions;

import java.util.Scanner;
import employmentSystem.MainClass;

public class Delete {

	public static void delete() {

		Scanner scanner = MainClass.scanner;

		// I did not write this program assuming that aspects would be deleted.
		// Only the employee itself.

		System.out.println("Here are the possible IDs to delete:");

		for (int key : MainClass.empHash.keySet()) {
			System.out.println(key);
		}

		System.out.println("Please enter the ID of the person you want to delete:");

		int updateID = scanner.nextInt();

		if (MainClass.empHash.containsKey(updateID)) {

			System.out.println(
					"Employee with name " + MainClass.empHash.get(updateID).getFullName() + " has been deleted.");
			MainClass.empHash.remove(updateID);
		}

	}

}
