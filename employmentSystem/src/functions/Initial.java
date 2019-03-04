package functions;

import java.io.*;
import java.util.*;

import employmentSystem.*;
import enums.USSTATES;

public class Initial {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
		for(int i = 0; i < 10; i++) {
			Employee employee = new Employee();
			Address address = new Address();
			employee.setFullName("Employee");
			employee.setEmployeeID(i+1);
			employee.setDateOfBirth("0");
			employee.setPhoneNumber(123456789);
			address.setStreetNumber(110);
			address.setStreetName("Allen Road");
			address.setCity("Basking Ridge");
			address.setState(USSTATES.NJ);
			address.setZipCode(18854);
			employee.setAddress(address);
			employee.setEmail("blahblahblah@collabera.com");
			employee.setSalary((i * 10000));
			employee.setSsn(111111111);
			employees.put(employee.getEmployeeID(), employee);
		}
		Helpers.serializeObject(employees, MainClass.fileName);
	}
}
