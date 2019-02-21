package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
import employmentSystem.Manager;
import employmentSystem.Manager;
import employmentSystem.Person;
import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;
import enums.MONTHS;
import enums.USSTATES;

public class Create {

	
	
	public static void create() throws FileNotFoundException, IOException {
		
		
		//Setting up all the variables.
		Scanner scanner = MainClass.scanner;
		GENDER g3 = null;
		DEPARTMENT d3 = null;
		JOBTITLE j3 = null;
		USSTATES u3 = null;
		MONTHS m3 = null;
		LinkedHashMap<Integer, Employee> empHash = MainClass.empHash;
		Address address = new Address();
		Employee employee = new Employee();		
		
	//Is there a way to not have please print an integer twice.****
		//The spaces are a big deal too. 
		//Try to find a solution for when printed numbers can start with 0. Like zip codes.
		
		
			
			
			//Make it start with 0. 
			int employeeID;
			
			do {
				System.out.println("Please enter 5 digit employee ID. Company policy");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Please print an integer.");
					scanner.nextLine();
					
				}
				employeeID = scanner.nextInt();
				scanner.nextLine();
				
				
				
			} while ((Integer.toString(employeeID).length() != 5));
			
			employee.setEmployeeID(employeeID);

			
			
		
			
			
			String email = null; 
			
			do {
				System.out.println("Enter an Email ID. It will be followed with @Collabera.com.");
				email = scanner.nextLine();
			
				if (!email.matches("[a-zA-Z0-9]*")) {
					System.out.println("No spaces or non-alphanumeric characters.");
				}
				
				
			} while (!email.matches("[a-zA-Z0-9]*"));
			
			//System.out.println("The email is " + email + "@Collabera.com.");
			employee.setEmail(email);
		
		

			
			

			String jobTitle;
			do {
				System.out.println("Print your job title. Press 1 for Booker, 2 for Salaryman, 3 for Dog.");
				jobTitle = scanner.nextLine();
				
				if (!jobTitle.equals("1") && !jobTitle.equals("2") && !jobTitle.equals("3")) {
					System.out.println("Please pick one of the three choices. Nothing else.");
				}
					
			}	while (!jobTitle.equals("1") && !jobTitle.equals("2") && !jobTitle.equals("3"));
			
			if (jobTitle.equals("1")) {
				j3 = JOBTITLE.BOOKER;
			}
			else if (jobTitle.equals("2")) {
				j3 = JOBTITLE.SALARYMAN;
			}
			else {
				j3 = JOBTITLE.DOG;
			}
			
			employee.setJobTitle(j3); 
			

			
			
			//Check if something is ONLY letters and numbers.
				
			

			
			int ssn;
			do {
				System.out.println("What's your social security number? No hyphens, just a 9 digit number.");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Please print an integer.");
					scanner.nextLine();
				}
				ssn = scanner.nextInt();
				scanner.nextLine();
				
				
				
			} while ((Integer.toString(ssn).length() != 9));
				
			employee.setSsn(ssn);
		
			
			
		
			
		
			//This doesn't take decimals for now. Fix that.
			//This also needs a way to prevent spaces from coming out. 
			long salary;
			
			do {
				System.out.println("What's your salary?");
				while (!scanner.hasNextLong()) {
					
					System.out.println("Please print an actual number.");
					scanner.nextLine();
				}
				salary = scanner.nextLong();
				scanner.nextLine();
				
				if (salary > 1000000000000l) {
					System.out.println("Please don't print a ridiculous amount that clearly isn't your salary.");
					System.out.println("If you really earned over $1 trillion, stop this program and tell me to make");
					System.out.println("you a custom one.");
				}
				
				
			} while ((salary < 0) || (salary > 1000000000000l));
			
			
			employee.setSalary(salary);
			
			
		
				
				
			int streetNumber;
			
			
			do {
				System.out.println("Please enter your street number.");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Please print an actual number.");
					scanner.nextLine();
				}
				streetNumber = scanner.nextInt();
				scanner.nextLine();
				
				
				
				
			} while ((Integer.toString(streetNumber).length() < 3) || (5 < (Integer.toString(streetNumber).length())));
			
			address.setStreetNumber(streetNumber);
	
				
		
		
		

		
		//Allow for spaces here by the link below.
		//https://docs.oracle.com/javase/tutorial/essential/regex/pre_char_classes.html
		String streetName;	
		do {
			System.out.println("Print the street name. For now, just one word. Spaces joining later.");
			streetName = scanner.nextLine(); 
		
			if (!streetName.matches("[a-zA-Z0-9]*")) {
				System.out.println("No non-alphanumeric characters.");
			}
		} while (!streetName.matches("[a-zA-Z0-9]*") );
		
		//System.out.println("The street name is " + streetName + ". ");
		
		
		address.setStreetName(streetName);
				
		
		String city;
		
		
		do {
		System.out.println("Print the city. One word. Fix that later.");
		city = scanner.nextLine();
	
		if (!city.matches("[a-zA-Z]*")) {
			System.out.println("No spaces or non-alphanumeric characters.");
		}
	    
		} while (!city.matches("[a-zA-Z]*"));
	

		
		address.setCity(city);
		
				
		
		
		
		

		String state;
		String capState;
		do {
			System.out.println("What is your state? Print the two letter abbreviation");
			System.out.println("Type 'pa' if you live in Pennsylvania, for instance.");
			//A future value might outline them all.
			state = scanner.nextLine();
			capState = state.toUpperCase();
			
			if (!capState.equals("AL") && !capState.equals("AK") && !capState.equals("AS") &&
					!capState.equals("AZ") && !capState.equals("AR") && !capState.equals("CA") &&
					!capState.equals("CO") && !capState.equals("CT") && !capState.equals("DC") &&
					!capState.equals("DE") && !capState.equals("FL") && !capState.equals("FM") &&
					!capState.equals("GA") && !capState.equals("GU") && !capState.equals("HI") &&
					!capState.equals("ID") && !capState.equals("IL") && !capState.equals("IN") &&
					!capState.equals("IA") && !capState.equals("KS") && !capState.equals("KY") &&
					!capState.equals("LA") && !capState.equals("ME") && !capState.equals("MD") &&
					!capState.equals("MA") && !capState.equals("MH") && !capState.equals("MI") &&
					!capState.equals("MN") && !capState.equals("MS") && !capState.equals("MO") &&
					!capState.equals("MP") && !capState.equals("MT") && !capState.equals("NE") &&
					!capState.equals("NV") && !capState.equals("NH") && !capState.equals("NJ") &&
					!capState.equals("NM") && !capState.equals("NY") && !capState.equals("NC") &&
					!capState.equals("ND") && !capState.equals("OH") && !capState.equals("OK") &&
					!capState.equals("OR") && !capState.equals("PA") && !capState.equals("PR") &&
					!capState.equals("PW") && !capState.equals("RI") && !capState.equals("SC") &&
					!capState.equals("SD") && !capState.equals("TN") && !capState.equals("TX") &&
					!capState.equals("UT") && !capState.equals("VT") && !capState.equals("VA") &&
					!capState.equals("VI") && !capState.equals("WA") && !capState.equals("WV") &&
					!capState.equals("WI") && !capState.equals("WY")) 
			{
				System.out.println("Please pick one of the 50 available states.");
			}
				
		}
		
		while (!capState.equals("AL") && !capState.equals("AK") && !capState.equals("AS") &&
				!capState.equals("AZ") && !capState.equals("AR") && !capState.equals("CA") &&
				!capState.equals("CO") && !capState.equals("CT") && !capState.equals("DC") &&
				!capState.equals("DE") && !capState.equals("FL") && !capState.equals("FM") &&
				!capState.equals("GA") && !capState.equals("GU") && !capState.equals("HI") &&
				!capState.equals("ID") && !capState.equals("IL") && !capState.equals("IN") &&
				!capState.equals("IA") && !capState.equals("KS") && !capState.equals("KY") &&
				!capState.equals("LA") && !capState.equals("ME") && !capState.equals("MD") &&
				!capState.equals("MA") && !capState.equals("MH") && !capState.equals("MI") &&
				!capState.equals("MN") && !capState.equals("MS") && !capState.equals("MO") &&
				!capState.equals("MP") && !capState.equals("MT") && !capState.equals("NE") &&
				!capState.equals("NV") && !capState.equals("NH") && !capState.equals("NJ") &&
				!capState.equals("NM") && !capState.equals("NY") && !capState.equals("NC") &&
				!capState.equals("ND") && !capState.equals("OH") && !capState.equals("OK") &&
				!capState.equals("OR") && !capState.equals("PA") && !capState.equals("PR") &&
				!capState.equals("PW") && !capState.equals("RI") && !capState.equals("SC") &&
				!capState.equals("SD") && !capState.equals("TN") && !capState.equals("TX") &&
				!capState.equals("UT") && !capState.equals("VT") && !capState.equals("VA") &&
				!capState.equals("VI") && !capState.equals("WA") && !capState.equals("WV") &&
				!capState.equals("WI") && !capState.equals("WY"));
		
		
		switch(capState) {
		
			case "AL":
				u3 = USSTATES.AL;
				break;
			case "AK":
				u3 = USSTATES.AK;
				break;
			case "AS":
				u3 = USSTATES.AS;
				break;
			case "AZ":
				u3 = USSTATES.AZ;
				break;
			case "AR":
				u3 = USSTATES.AR;
				break;
			case "CA":
				u3 = USSTATES.CA;
				break;
			case "CO":
				u3 = USSTATES.CO;
				break;
			case "CT":
				u3 = USSTATES.CT;
				break;
			case "DC":
				u3 = USSTATES.DC;
				break;
			case "DE":
				u3 = USSTATES.DE;
				break;
			case "FL":
				u3 = USSTATES.FL;
				break;
			case "FM":
				u3 = USSTATES.FM;
				break;
			case "GA":
				u3 = USSTATES.GA;
				break;
			case "GU":
				u3 = USSTATES.GU;
				break;
			case "HI":
				u3 = USSTATES.HI;
				break;
			case "ID":
				u3 = USSTATES.ID;
				break;
			case "IL":
				u3 = USSTATES.IL;
				break;
			case "IN":
				u3 = USSTATES.IN;
				break;
			case "IA":
				u3 = USSTATES.IA;
				break;
			case "KS":
				u3 = USSTATES.KS;
				break;
			case "KY":
				u3 = USSTATES.KY;
				break;
			case "LA":
				u3 = USSTATES.LA;
				break;
			case "ME":
				u3 = USSTATES.ME;
				break;
			case "MD":
				u3 = USSTATES.MD;
				break;
			case "MA":
				u3 = USSTATES.MA;
				break;
			case "MH":
				u3 = USSTATES.MH;
				break;
			case "MI":
				u3 = USSTATES.MI;
				break;
			case "MN":
				u3 = USSTATES.MN;
				break;
			case "MS":
				u3 = USSTATES.MS;
				break;
			case "MO":
				u3 = USSTATES.MO;
				break;
			case "MP":
				u3 = USSTATES.MP;
				break;
			case "MT":
				u3 = USSTATES.MT;
				break;
			case "NE":
				u3 = USSTATES.NE;
				break;
			case "NV":
				u3 = USSTATES.NV;
				break;
			case "NH":
				u3 = USSTATES.NH;
				break;
			case "NJ":
				u3 = USSTATES.NJ;
				break;
			case "NM":
				u3 = USSTATES.NM;
				break;
			case "NY":
				u3 = USSTATES.NY;
				break;
			case "NC":
				u3 = USSTATES.NC;
				break;
			case "ND":
				u3 = USSTATES.ND;
				break;
			case "OH":
				u3 = USSTATES.OH;
				break;
			case "OK":
				u3 = USSTATES.OK;
				break;
			case "OR":
				u3 = USSTATES.OR;
				break;
			case "PA":
				u3 = USSTATES.PA;
				break;
			case "PR":
				u3 = USSTATES.PR;
				break;
			case "PW":
				u3 = USSTATES.PW;
				break;
			case "RI":
				u3 = USSTATES.RI;
				break;
			case "SC":
				u3 = USSTATES.SC;
				break;
			case "SD":
				u3 = USSTATES.SD;
				break;
			case "TN":
				u3 = USSTATES.TN;
				break;
			case "TX":
				u3 = USSTATES.TX;
				break;
			case "UT":
				u3 = USSTATES.UT;
				break;
			case "VT":
				u3 = USSTATES.VT;
				break;
			case "VA":
				u3 = USSTATES.VA;
				break;
			case "VI":
				u3 = USSTATES.VI;
				break;
			case "WA":
				u3 = USSTATES.WA;
				break;
			case "WV":
				u3 = USSTATES.WV;
				break;
			case "WI":
				u3 = USSTATES.WI;
				break;
			case "WY":
				u3 = USSTATES.WY;
				break;
			
			default:
				System.out.println("You have failed to print a state.");
				break;
				
		}
		address.setState(u3);
		
	
			
			
			
			int zipCode;
			
			do {
				System.out.println("What is your zip code?");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Please print an integer.");
					scanner.nextLine();
					
				}
				zipCode = scanner.nextInt();
				scanner.nextLine();
				
				
				
			} while ((Integer.toString(zipCode).length() != 5));
			
			address.setZipCode(zipCode);
					
			
		
				
		
				
				
				
		
		
		
		
		String firstName;
		
		
		do {
		System.out.println("Enter first name.");
		firstName = scanner.nextLine();
	
		if (!firstName.matches("[a-zA-Z]*")) {
			System.out.println("A one word name. No spaces, only letters.");
		}
	    
		} while (!firstName.matches("[a-zA-Z]*"));
	
	  
		String lastName;
		do {
			System.out.println("Enter last name.");
			lastName = scanner.nextLine();
		
			if (!lastName.matches("[a-zA-Z]*")) {
				System.out.println("A one word name. No spaces, only letters.");
			}
		    
			} while (!lastName.matches("[a-zA-Z]*"));
		
		
		
		String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
		employee.setFullName(fullName);
						
		
			
			
			
			int age;
			
			do {
				System.out.println("Enter age: ");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Please print an integer.");
					scanner.nextLine();
				}
				age = scanner.nextInt();
				
				if (age > 200 || age < 18) {
					System.out.println("Please print a reasonable age. You are not over 200.");
					System.out.println("You must also be at least 18 to work here.");
				}
				
				
				
				
			} while (age > 200 || age < 18);
			
		
			employee.setAge(age);
		
		
			
			
			long phoneNumber;
			
			
			do {
				System.out.println("Enter phone number without hyphens.");
				while (!scanner.hasNextLong()) {
					
					System.out.println("A phone number must be exactly 10 digits.");
					System.out.println("Print 800, not 1800, should your number be of this format.");
					scanner.nextLine();
				}
				phoneNumber = scanner.nextLong();
				scanner.nextLine();
				
				
				
				
			} while (Long.toString(phoneNumber).length() != 10);
					
			
			employee.setPhoneNumber(phoneNumber);
		

		String gender;
		
		do {
			System.out.println("Enter gender. Type m for male, f for female, o for other");
			gender = scanner.nextLine();
			
			if (!gender.equals("m") && !gender.equals("f") && !gender.equals("o"))
				System.out.println("Please pick one of the three choices. Nothing else.");
		}
		
		while (!gender.equals("m") && !gender.equals("f") && !gender.equals("o"));
		

		if (gender.equals("m")) {
			g3 = GENDER.MALE;
		}
		else if (gender.equals("f")) {
			g3 = GENDER.FEMALE;
		}
		else if (gender.equals("o")) {
			g3 = GENDER.OTHER;
		}

		employee.setGender(g3);
		
						
		//System.out.println("Setting up today as the day " + fullName + " starts work.");
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		employee.setDateStartWork(date);
		
		
		
		
		String birthMonth;
		int birthDay = 0;
		
		do {
			System.out.println("Print month of birth by number.");
			System.out.println("Print 1 for January, 2 for February, 3 for March, etc.");
			birthMonth = scanner.nextLine();
			
			if (!birthMonth.equals("1") && !birthMonth.equals("2") && !birthMonth.equals("3") &&
					!birthMonth.equals("4") && !birthMonth.equals("5") && !birthMonth.equals("6") &&
					!birthMonth.equals("7") && !birthMonth.equals("8") && !birthMonth.equals("9") &&
					!birthMonth.equals("10") && !birthMonth.equals("11") && !birthMonth.equals("12")) {
				System.out.println("Please pick one of the twelve choices. Nothing else.");
			}
				
		}
		
		while (!birthMonth.equals("1") && !birthMonth.equals("2") && !birthMonth.equals("3") &&
				!birthMonth.equals("4") && !birthMonth.equals("5") && !birthMonth.equals("6") &&
				!birthMonth.equals("7") && !birthMonth.equals("8") && !birthMonth.equals("9") &&
				!birthMonth.equals("10") && !birthMonth.equals("11") && !birthMonth.equals("12"));

		
			
			
			switch (birthMonth) {
			
			case "1": 
				m3 = MONTHS.JANUARY;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
					do {
						
						while (!scanner.hasNextInt()) {
							
							System.out.println("Please print an integer.");
							scanner.nextLine();
						}
						birthDay = scanner.nextInt();
						
						if(birthDay < 1 || 31 < birthDay) {
							System.out.println("Real date.");
							scanner.nextLine();
						}
						
					} while (birthDay < 1 || 31 < birthDay);
				
				break;
			case "2": 
				m3 = MONTHS.FEBRUARY;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 28 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 28 < birthDay);
				break;
			case "3": 
				m3 = MONTHS.MARCH;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			case "4": 
				m3 = MONTHS.APRIL;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 30 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 30 < birthDay);
				break;
			case "5": 
				m3 = MONTHS.MAY;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			case "6": 
				m3 = MONTHS.JUNE;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 30 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 30 < birthDay);
				break;
			case "7": 
				m3 = MONTHS.JULY;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			case "8": 
				m3 = MONTHS.AUGUST;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			case "9": 
				m3 = MONTHS.SEPTEMBER;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 30 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 30 < birthDay);
				break;
			case "10": 
				m3 = MONTHS.OCTOBER;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			case "11": 
				m3 = MONTHS.NOVEMBER;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 30 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 30 < birthDay);
				break;
			case "12": 
				m3 = MONTHS.DECEMBER;
				System.out.println("Print day of " + m3.toString() + " you were born on.");
				
				do {
					
					while (!scanner.hasNextInt()) {
						
						System.out.println("Please print an integer.");
						scanner.nextLine();
					}
					birthDay = scanner.nextInt();
					
					if(birthDay < 1 || 31 < birthDay) {
						System.out.println("Real date.");
						scanner.nextLine();
					}
					
				} while (birthDay < 1 || 31 < birthDay);
				break;
			default:
				System.out.println("You did not pick an option listed.");
				break;
			}
			
			
			
			int birthYear;
			do {
				System.out.println("Print year of birth.");
				while (!scanner.hasNextInt()) {
					
					System.out.println("Print a number.");
					scanner.nextLine();
				}
				birthYear = scanner.nextInt();
				
				if (birthYear < 1800 || 2019 < birthYear) {
					System.out.println("Real year. You weren't born this early or this late.");
					scanner.nextLine();
				}
				
			} while (birthYear < 1800 || 2019 < birthYear);
			scanner.nextLine();
			String birthDate = m3.toString().toLowerCase() + " " + birthDay + ", " + birthYear;
			employee.setDateOfBirth(birthDate);
		
		

		
				
				
		
		
		
		
		String dept;
		
		do {
			System.out.println("What department do you work in?.");
			System.out.println("Type i for IT, m for Marketing, h for HR.");
			dept = scanner.nextLine();
			
			if (!dept.equals("i") && !dept.equals("m") && !dept.equals("h"))
				System.out.println("Please pick one of the three choices. Nothing else.");
		}
		
		while (!dept.equals("i") && !dept.equals("m") && !dept.equals("h"));
		

		if (dept.equals("i")) {
			d3 = DEPARTMENT.IT;
					
		}
		else if (dept.equals("m")) {
			d3 = DEPARTMENT.MARKETING;
		}
		else if (dept.equals("h")) {
			d3 = DEPARTMENT.HR;
		}
		else {
			System.out.println("Do a real option.");
					
		}
		employee.setDept(d3);
		
		employee.setAddress(address);
		
		/*
		//Doing manager.
		
		System.out.println("Is the employee a manager?");
		System.out.println("Type 1 for yes, 2 for no.");
		int managing = scanner.nextInt();
		scanner.nextLine();
		if (managing == 1) {
			//employee = new Manager();

			
			
			System.out.println("How many employees do you want to work under the manager?");
			int amount = scanner.nextInt();
			scanner.nextLine();
			//Check that this is less than the amount of employees available.
			
			//Ask for number of managed employees.
			//Go through arraylist to find employees, and confirm working or not working for.
			//Stop when number of employees is reached.
			
		}
		
		
		//Ask if the employee is a manager.
		//Otherwise, the toString of the element will specify "Not a manager".*/
		 
		
		
		//Setting values
		empHash.put(employee.getEmployeeID(), employee);
		int listLength = empHash.size();
		MainClass.keyValues[listLength] = employee.getEmployeeID();
		
		
		

				
		//Adding this to file. 
		WriteToSystem.serializeObject(MainClass.empHash, "content.txt");
				

	}
}




