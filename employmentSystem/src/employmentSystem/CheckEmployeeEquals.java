package employmentSystem;

import java.util.TreeSet;

import enums.DEPARTMENT;

public class CheckEmployeeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Employee emp1, emp2;
//		emp1 = new Employee();
//		emp1.setAge(4);
//		
//		emp2 = new Employee();
//		emp2.setAge(4);
//		
//		System.out.println(emp1.equals(emp2));
		
		TreeSet<Employee> emps = new TreeSet<>();
		
		for (int i = 0; i < 10; i++) {
			Employee emp = new Employee();
			emp.setDept(DEPARTMENT.HR);
			
			emp.setAge(20);
			
			emps.add(emp);
		}
		
		
		System.out.println(emps);
		
		for (Employee emp: emps) {
			System.out.println(emp);
		}
		
	}

}
