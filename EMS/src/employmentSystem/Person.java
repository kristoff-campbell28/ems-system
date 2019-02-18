package employmentSystem;

import java.util.Date;

import enums.GENDER;

public class Person {
	
	
	
	protected GENDER gender;
	protected int age; //three digit limit. 
	protected long phoneNumber; //Must be 10 digits exactly.
	protected String dateOfBirth; //Make this date later.
	//Also ask for this in multiple pieces.

	
	
	
	
	
	protected String fullName;
	public Address address;
	
	
	
	

	

	public Person(GENDER gender, int age, long phoneNumber, String dateOfBirth, String fullName, Address address) {
		super();
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.fullName = fullName;
		this.address = address;
	}
	public Person() {
		
		
	}
	
	
	

	



	
	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", gender="
				+ gender + ", age=" + age + ", phoneNumber=" + phoneNumber + ", date=" + dateOfBirth + "]";
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	//contact Number
	
	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
		
	

	
	
	
	
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	

	
	



	
	/*public enum GenderOptions {
	MALE, FEMALE, OTHER
}

GenderOptions go;

public Person (GenderOptions go) {
	this.go = go;
}



public void genderChoice() {
	switch(go) {
	
		case MALE:
			System.out.println("store m somehow. ");
			break;
			
		case FEMALE:
			System.out.println("store f somehow. ");
			break;
		
		case OTHER:
			System.out.println("store o somehow. ");
			break;
	}
} */
		//set male as true, female as false.
		// make sure to return certain values based on the circumstance.
		// Like, ensure that they type m or f, for male or female. 
		// Then return true for male, false for female
	
		//Alternative. Male and female are part of an enum. 
		// The user just inputs m or f. 
	
		// Return enum?

}
