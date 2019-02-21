package functions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import employmentSystem.Address;
import employmentSystem.Employee;
import employmentSystem.MainClass;
import enums.DEPARTMENT;
import enums.GENDER;
import enums.JOBTITLE;
import enums.USSTATES;

public class Update {
	
	public static void updater() throws FileNotFoundException, IOException {
		
		
		/*
		 * FIND THE PROBLEMS!!!!
		 * This includes email. 
		 */
		
		
		Scanner scanner = MainClass.scanner;
		Address address = new Address();
		USSTATES u3 = null;
		DEPARTMENT d3 = null;
		JOBTITLE j3 = null;
		GENDER g3 = null;
		
		
		
		
		
		System.out.println("Your choices are as follows: ");
		
		for (int key : MainClass.empHash.keySet()) {
			System.out.println(key);
		}
		
		
		
			
		System.out.println("Please enter the ID of the employee you wish to change some aspect of.");
			
			
			
		int employeeID; 
		do {
			System.out.println("Enter ID of user you want to view: ");
			
			
			while (!scanner.hasNextInt()) {
				scanner.nextLine();
				System.out.println("Please print an integer.");
			}
			employeeID = scanner.nextInt();
			
			if (!MainClass.empHash.containsKey(employeeID)) {
				System.out.println("Please pick one of the possible IDs.");
				scanner.nextLine();
			}
			
				
		}
		
		while (!MainClass.empHash.containsKey(employeeID));
		
			
		
			
		
			
				Employee employee = MainClass.empHash.get(employeeID);
							
				System.out.println("Here are all the details of the employee with ID " + employeeID + ": ");
				System.out.println(employee);
				System.out.println("What detail would you like to modify?");
				System.out.println("Please note that, due to safety reasons, "
							+ "we only allow one item to be modified at a time.");
					
				System.out.println("Press 2 for changing the department worked in.");
				System.out.println("Press 3 for changing the email.");
				System.out.println("Press 4 for changing the job title.");
				System.out.println("Press 5 for changing the social security number.");
				System.out.println("Press 6 for changing the salary.");
				System.out.println("Press 7 for changing the full name.");
				System.out.println("Press 8 for changing the phone number.");
				System.out.println("Press 9 for changing all details in their address.");
				System.out.println("Press 10 for changing the gender.");
				System.out.println("Press 11 for changing the age.");
				
				
				
				int choice;
				
				do {
					System.out.println("Choose between 2 and 11.");
					
					
					while (!scanner.hasNextInt()) {
						scanner.nextLine();
						System.out.println("Please print an integer.");
					}
					choice = scanner.nextInt();
					
					if (choice < 2 && 11 < choice) {
						System.out.println("Please pick one of the possible choices.");
						scanner.nextLine();
					}
					
						
				}
				
				while (choice < 2 && 11 < choice);
					
					
					switch(choice) {
					//Fix the repetition. It does the do-while loop twice. 
						case 2:
							System.out.println("This is the old department worked in: ");
							System.out.println(employee.getDept());
							System.out.println("Enter the new department.");
							
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

							employee.setDept(d3);
							System.out.println("The department worked in has been changed to " + employee.getDept());
							break;
						case 3:
							System.out.println("This is the old email: ");
							System.out.println(employee.getEmail() + "@Collabera.com");
							
							String email = null; 
							
							do {
								System.out.println("Enter a new email. It will be followed with @Collabera.com.");
								email = scanner.nextLine();
							
								if (!email.matches("[a-zA-Z0-9]*")) {
									System.out.println("No spaces or non-alphanumeric characters.");
								}
								
								
							} while (!email.matches("[a-zA-Z0-9]*"));
							
							//System.out.println("The email is " + email + "@Collabera.com.");
							employee.setEmail(email);

							employee.setEmail(email);
							System.out.println("The email has been changed to " + employee.getEmail() + "@Collabera.com");
							break;
						case 4:
							
							System.out.println("This is the old job title: ");
							System.out.println(employee.getJobTitle());
							
							
							
							int jobTitle;
							do {
								System.out.println("Enter the new job title.");
								System.out.println("Press 1 for Booker, 2 for Salaryman, 3 for Dog.");
								jobTitle = scanner.nextInt();
								
								while (!scanner.hasNextInt()) {
									scanner.nextLine();
									System.out.println("Print a real number.");
								}
								
								if (jobTitle < 1 && 3 < jobTitle) {
									System.out.println("Please pick one of the three choices. Nothing else.");
								}
									
							}	while (jobTitle < 1 && 3 < jobTitle);
							
							if (jobTitle == 1) {
								j3 = JOBTITLE.BOOKER;
							}
							else if (jobTitle == 2) {
								j3 = JOBTITLE.SALARYMAN;
							}
							else if (jobTitle == 3) {
								j3 = JOBTITLE.DOG;
							}
							
							
							employee.setJobTitle(j3);
							System.out.println("The job has been changed to " + employee.getJobTitle());
							break;
						case 5:
							System.out.println("This is the old social security number: ");
							String ssnOld = Integer.toString(employee.getSsn());
							System.out.println(ssnOld.substring(0, 3) + "-" + ssnOld.substring(3, 5) + "-" + ssnOld.substring(5, 9));
							
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
								
							String newSsnString = Integer.toString(ssn);
							System.out.println("The social security number has been changed to ");
							System.out.println(newSsnString.substring(0, 3) + "-" + newSsnString.substring(3, 5) + "-" + newSsnString.substring(5, 9));
							
							employee.setSsn(ssn);						
							break;
						case 6:
							
							//FIX THIS!!!!
							System.out.println("This is the old salary: ");
							System.out.print("$");
							System.out.printf("%.2f", employee.getSalary());
							System.out.println();
							
							long salary;
							
							do {
								System.out.println("Enter the new salary.");
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
							
							
							//scanner.nextLine();
						
							System.out.println("The salary has been changed to: ");
							System.out.print("$");
							System.out.printf("%.2f", employee.getSalary());
							System.out.println();
							break;
						case 7:
							System.out.println("This is the old full name: ");
							System.out.println(employee.getFullName());
							
							String firstName;
							
							
							do {
							System.out.println("Enter new first name.");
							firstName = scanner.nextLine();
						
							if (!firstName.matches("[a-zA-Z]*")) {
								System.out.println("A one word name. No spaces, only letters.");
							}
						    
							} while (!firstName.matches("[a-zA-Z]*"));
						
						  
							String lastName;
							do {
								System.out.println("Enter new last name.");
								lastName = scanner.nextLine();
							
								if (!lastName.matches("[a-zA-Z]*")) {
									System.out.println("A one word name. No spaces, only letters.");
								}
							    
								} while (!lastName.matches("[a-zA-Z]*"));
							
							
							
							String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
							employee.setFullName(fullName);
							System.out.println("The employee ID has been changed to " + employee.getFullName());
							break;
						case 8:
							System.out.println("This is the old phone number: ");
							long phoneNumber = employee.getPhoneNumber();
							String phoneString = String.format("%.0f\n", phoneNumber);
							System.out.println(phoneString.substring(0, 3) + "-" 
									+ phoneString.substring(3, 6)
									+ "-" + phoneString.substring(6, 10));
							
							long newPhoneNumber;
							
							
							do {
								System.out.println("Enter new phone number without hyphens.");
								while (!scanner.hasNextLong()) {
									
									System.out.println("A phone number must be exactly 10 digits.");
									System.out.println("Print 800, not 1800, should your number be of this format.");
									scanner.nextLine();
								}
								newPhoneNumber = scanner.nextLong();
								
								if (Long.toString(newPhoneNumber).length() != 10) {
									scanner.nextLine();
									System.out.println("Do things.");
								}
								
								
								
								
								
							} while (Long.toString(newPhoneNumber).length() != 10);
						
							employee.setPhoneNumber(newPhoneNumber);
							System.out.println("The phone number has been changed to ");
							System.out.println(Long.toString(newPhoneNumber).substring(0, 3) + "-" 
									+ Long.toString(newPhoneNumber).substring(3, 6)
									+ "-" + Long.toString(newPhoneNumber).substring(6, 10));
							break;
						case 9:
							System.out.println("This is the old address: ");
							System.out.println(employee.getAddress().toString());
							
							System.out.println("Enter the new address by following the steps below:");
							
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
				
						String city;
						
						
						do {
						System.out.println("Print the city. One word. Fix that later.");
						city = scanner.nextLine();
					
						if (!city.matches("[a-zA-Z]*")) {
							System.out.println("No spaces or non-alphanumeric characters.");
						}
					    
						} while (!city.matches("[a-zA-Z]*"));
					
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
							
							
							address.setStreetNumber(streetNumber);
							address.setStreetName(streetName);
							address.setCity(city);
							address.setState(u3);
							address.setZipCode(zipCode);
							
							employee.setAddress(address);
							
							System.out.println("The address has been changed to: ");
							System.out.println(employee.getAddress().toString());
							break;
							
						case 10:
							
							System.out.println("This is the old gender: ");
							System.out.println(employee.getGender());
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
							System.out.println("The gender has been changed to " + g3 + ". ");
							break;
						case 11:
							System.out.println("This is the old age: ");
							System.out.println(employee.getAge());
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
							System.out.println("The age has been changed to " + employee.getAge() + ". ");
							break;
						
							
						default:
							System.out.println("Please print an actual option.");
							break;
					}
					
					
					WriteToSystem.serializeObject(MainClass.empHash, "content.txt");

			
		
			
		
		
		
			
		
		
	}

}
