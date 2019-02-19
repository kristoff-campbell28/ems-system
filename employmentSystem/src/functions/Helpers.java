package functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Helpers {

	public static Object deserializeObject(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(new File(fileName)));
		Object object = inStream.readObject();
		inStream.close();
		return object;
	}

	public static void serializeObject(Object object, String fileName) throws FileNotFoundException, IOException {
		ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
		outStream.writeObject(object);
		outStream.close();
	}

	public static String validateExp(Scanner scanner, String pattern) {
		String output = "";
		boolean loop = true;
		while (loop) {
			try {
				output = scanner.next(pattern);
				scanner.nextLine();
				loop = false;
			} catch (NoSuchElementException e) {
				System.out.println("Invalid input.");
				scanner.nextLine();
			}
		}
		return output;
	}

	public static int validateInt(Scanner scanner) {
		int output = 0;
		boolean loop = true;
		while (loop) {
			try {
				output = scanner.nextInt();
				scanner.nextLine();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input.");
				continue;
			}
		}
		return output;
	}

	public static int validateLength(Scanner scanner, int length) {
		int number;
		do {
			System.out.println("Please enter  a " + length + " integer");
			while (!scanner.hasNextInt()) {
				System.out.println("Please print an integer.");
				scanner.next();
			}
			number = scanner.nextInt();
			scanner.nextLine();
		} while (Integer.toString(number).length() != length);
		return number;
	}
	
	public static long  validateLongLength(Scanner scanner, int length) {
		int number;
		do {
			System.out.println("Please enter  a " + length + " integer");
			while (!scanner.hasNextInt()) {
				System.out.println("Please print an integer.");
				scanner.next();
			}
			number = scanner.nextInt();
			scanner.nextLine();
		} while (Integer.toString(number).length() != length);
		return number;
	}

}
