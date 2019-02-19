package functions;



import java.io.*;

import java.util.*;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
import enums.JOBTITLE;
import enums.USSTATES;



public class WriteToSystem {

	
	
	
	public static void serializeObject(Object object, String fileName) throws FileNotFoundException, IOException {

		ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));

		outStream.writeObject(object);

		outStream.close();

	}
	
	
	

}