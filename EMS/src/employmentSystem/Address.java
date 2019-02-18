package employmentSystem;

import enums.GENDER;
import enums.USSTATES;

public class Address extends Person{
    
    private int streetNumber; //No more than 5 digits.
    private String streetName; 
    //Should there be an optional apartment name?
    private USSTATES state; //Make this enum.
    //If we have time, make this a series of enums. 
    private String city; 
    private int zipCode; //Ensure that this amount is 5 or 9 digits. Nothing else. 
    
    
    
    public Address() {
    	
    }
    
    
    
    
    
	





	public Address(GENDER gender, int age, long phoneNumber, String dateOfBirth, String fullName, Address address,
			int streetNumber, String streetName, USSTATES state, String city, int zipCode) {
		super(gender, age, phoneNumber, dateOfBirth, fullName, address);
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}











	@Override
	public String toString() {
		return streetNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
				
	}




	public int getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    
    public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
	      return city;
	}
	public void setCity(String city) {
	      this.city = city;
	}


	public USSTATES getState() {
        return state;
    }
    public void setState(USSTATES state) {
        this.state = state;
    }
  
    
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
    }