package employmentSystem;

import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;

public class Employee extends Person {

	private static int idIncrement = 1; // Should this start at 0?

	public Address address;
	protected String dateStartWork; // Ask for this one in pieces.
	protected DEPARTMENT dept;
	protected int employeeID; // Exactly 5 digits.
	protected String email;
	protected JOBTITLE jobTitle;
	public Person person;
	protected int ssn; // Ensure exactly 9 digits.
	protected double salary; // Emphasize yearly. Two digits.

	// Manager is element, not class?

	// This serves the purpose of counting how many employees are in the system.
	public Employee() {

		super();

		this.employeeID = idIncrement;

		idIncrement++;

	}

	@Override
	public String toString() {
		return "Below are the details of employee with ID " + employeeID + " : \n" + "Date of birth is: " + dateOfBirth
				+ "\n" + "Department they inhabit is: " + dept + "\n" + "Email is: " + email + "@Collabera.com \n"
				+ "Their job title is: " + jobTitle + "\n" + "Social Security Number is: "
				+ Integer.toString(ssn).substring(0, 3) + "-" + Integer.toString(ssn).substring(3, 5) + "-"
				+ Integer.toString(ssn).substring(5, 9) + "\n" + "Salary is: " + salary + "\n" + "Full name is: "
				+ fullName + "\n" + "Age is: " + age + "\n" + "Phone Number is: "
				+ Long.toString(phoneNumber).substring(0, 3) + "-" + Long.toString(phoneNumber).substring(3, 6) + "-"
				+ Long.toString(phoneNumber).substring(6, 9) + "\n" + "Date they joined the company is: "
				+ dateStartWork + "\n" + "Their address is: \n" + address.getStreetNumber() + " "
				+ address.getStreetName() + "\n" + address.getCity() + ", " + address.getState() + " "
				+ address.getZipCode();
	}

	public Employee(GENDER gender, int age, long phoneNumber, String dateOfBirth, String fullName, Address address,
			String dateStartWork, DEPARTMENT dept, int employeeID, String email, JOBTITLE jobTitle, int ssn,
			double salary, Person person, Address address2) {
		super(gender, age, phoneNumber, dateOfBirth, fullName, address);
		this.dateStartWork = dateStartWork;
		this.dept = dept;
		this.employeeID = employeeID;
		this.email = email;
		this.jobTitle = jobTitle;
		this.ssn = ssn;
		this.salary = salary;
		this.person = person;
		address = address2;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DEPARTMENT getDept() {
		return dept;
	}

	public void setDept(DEPARTMENT dept) {
		this.dept = dept;
	}

	// Then combine the pieces to make a date.
	// This will define the date that work started.
	// date you startd employment.
	public String getDateStartWork() {
		return dateStartWork;
	}

	public void setDateStartWork(String dateStartWork) {
		this.dateStartWork = dateStartWork;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public JOBTITLE getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JOBTITLE jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
