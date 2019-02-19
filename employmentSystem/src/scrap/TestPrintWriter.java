package scrap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import employmentSystem.Employee;
import employmentSystem.MainClass;

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//set up file and the stream.
		File outFile = new File("samp3.txt");
		
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		
		PrintWriter outStream = new PrintWriter(outFileStream);
		
		
		
		
		
		
		
//		//Extra stuff
//		ArrayList<String> names = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			names.add("Name: " + i);
//		}
//		
//		outStream.println(names);
		
		
		//Print a map
		/*HashMap<Integer, String> hashMapOfNames = new HashMap<Integer, String>();
		
		for (int i = 0; i < 10; i++) {
			hashMapOfNames.put(i,  "name " + i);
		}
		
		System.out.println(hashMapOfNames);*/
		
		//Employee version
		
		
		//HashMap<Integer, Employee> hashMapOfEmps = new HashMap<Integer, Employee>();
		
		for (int i = 0; i<10; i++) {
			Employee employee = new Employee();
			employee.setEmail("email" + i);
			MainClass.empHash.put(i, employee);
		}
		
		outStream.println(MainClass.empHash);
		
		
		
		outStream.close();
		
		
		//write values of primitive data types to the stream.
		/*
		outStream.println(987654321);
		outStream.println("Hello, world");
		outStream.println(true);
		
		outStream.close();*/
		

	}

}