package scrap;

import java.io.*;
import java.util.*;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
import enums.*;
import functions.*;

public class Initial {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		LinkedHashMap<Integer, Employee> employees = new LinkedHashMap<Integer, Employee>();
		for(int i = 0; i < 10; i++) {
			Employee employee = new Employee();
			Address address = new Address();
			employee.setFullName("Employee" + i);
			employee.setJobTitle(JOBTITLE.ACCOUNTANT);
			employee.setEmployeeID(i+1);
			employee.setDateOfBirth("02/10/1994");
			employee.setPhoneNumber(1111111111);
			address.setStreetNumber(110);
			address.setStreetName("Allen Road");
			address.setCity("Basking Ridge");
			address.setState(USSTATES.AK);
			address.setZipCode(18854);
			employee.setAddress(address);
			employee.setEmail("blahblahblah@collabera.com");
			employee.setSalary((i * 10000));
			employee.setSsn(111111111);
			employees.put(employee.getEmployeeID(), employee);
		}
		System.out.println(employees);
		Helpers.serializeObject(employees, MainClass.fileName);
	}
}
