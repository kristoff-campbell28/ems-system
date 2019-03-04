package employmentSystem;

import java.util.ArrayList;

import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;

public class Manager extends Employee {

	public ArrayList<Integer> team;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
			return "Below are the details of employee with ID " + employeeID + " : \n" 
					+ "Date of birth is: " + dateOfBirth
					+ "\n" + "Department they inhabit is: " + dept + "\n" 
					+ "Email is: " + email + "@Collabera.com \n"
					+ "Their job title is: " + jobTitle + "\n" 
					+ "Social Security Number is: "
					+ Integer.toString(ssn).substring(0, 3) + "-" + Integer.toString(ssn).substring(3, 5) + "-"
					+ Integer.toString(ssn).substring(5, 9) + "\n" + "Salary is: " + salary + "\n" 
					+ "Full name is: " + fullName + "\n" 
					+ "Phone Number is: " + Long.toString(phoneNumber).substring(0, 3) + "-" + Long.toString(phoneNumber).substring(3, 6) + "-"
					+ Long.toString(phoneNumber).substring(6, 10) + "\n" 
					+ "Their gender is " + gender + "\n"
					+ "Date they joined the company is: " + dateStartWork + "\n" 
					+ "Their address is: \n" + address.getStreetNumber() + " " + address.getStreetName() + "\n" + address.getCity() + ", "
					+ address.getState() + " " + address.getZipCode() + "\n";
	}

	public Manager(GENDER gender, int age, long phoneNumber, String dateOfBirth, String fullName, Address address,
			String dateStartWork, DEPARTMENT dept, int employeeID, String email, JOBTITLE jobTitle, int ssn,
			double salary, Person person, Address address2) {
		super(gender, age, phoneNumber, dateOfBirth, fullName, address, dateStartWork, dept, employeeID, email,
				jobTitle, ssn, salary, person, address2);
		// TODO Auto-generated constructor stub
	}

	public Manager(Employee employee) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Integer> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Integer> team) {
		this.team = team;
	}

	public void addEmployee(Employee employee) {
		this.team.add(employee.getEmployeeID());
	}

	public void removeEmployee(Employee employee) {
		this.team.remove(employee.getEmployeeID());
	}

	// What's below here is currently unnecessary. Too many steps ahead of where we
	// are now.

	/*
	 * public Manager(Employee employee) { super(); this.email =
	 * employee.getEmail(); this.dateofBirth = employee.getDateofBirth();
	 * this.jobTitle = employee.getJobTitle(); this.salary = employee.getSalary();
	 * this.ssn = employee.getSsn(); }
	 * 
	 * 
	 * 
	 * Set<Integer> team;
	 * 
	 * public Set<Integer> getTeam() { return team; }
	 * 
	 * 
	 * 
	 * public void setTeam(Set<Integer> team) { this.team = team; }
	 */

	 
}
