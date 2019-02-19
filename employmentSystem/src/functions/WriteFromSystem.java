package functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteFromSystem {

	
	
	public static Object deserializeObject(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(new File(fileName)));

		Object object = inStream.readObject();

		inStream.close();

		return object;

	}
}
