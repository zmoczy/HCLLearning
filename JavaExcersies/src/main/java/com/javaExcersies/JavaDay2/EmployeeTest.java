package com.javaExcersies.JavaDay2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Zachary" , "Moczygemba", 3500);
		Employee emp2 = new Employee("Tom", "Roberts", 4500);
		double newsalary1 = emp1.getMonthlySalary() + emp1.getMonthlySalary() * .1;
		emp1.setMonthlySalary(newsalary1);
		double newsalary2 = emp2.getMonthlySalary() + emp2.getMonthlySalary() * 1;
		emp2.setMonthlySalary(newsalary2);
		
	}

}
