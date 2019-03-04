package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import employmentSystem.MainClass;

public class Delete {

	public static void delete() throws FileNotFoundException, IOException {

		Scanner scanner = MainClass.scanner;

		System.out.println("Here are the possible IDs to delete:");

		for (int key : MainClass.empHash.keySet()) {
			System.out.println(key);
		}

		System.out.println("Please enter the ID of the person you want to delete:");

		try {
			int updateID = scanner.nextInt();

			if (MainClass.empHash.containsKey(updateID)) {

				System.out.println(
						"Employee with name " + MainClass.empHash.get(updateID).getFullName() + " has been deleted.");
				MainClass.empHash.remove(updateID);
			}

			else {
				System.out.println("Please print a valid employee.");
				delete();
			}

			Helpers.serializeObject(MainClass.empHash, "content.txt");
		} catch (InputMismatchException e) {

			System.out.println("Please Enter Vaild ID: ");

			scanner.nextLine();

			delete();

		}

	}

}
