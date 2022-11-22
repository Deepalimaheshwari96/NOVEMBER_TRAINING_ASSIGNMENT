package org.yash.oops.assignment.program11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program11 {

	public static void main(String[] args) {
		// Date of Birth of Employee is
		String dateOfBirth = "05 May 1989";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
		LocalDate date_of_birth = LocalDate.parse(dateOfBirth, formatter1);
		String dob = date_of_birth.toString();

		// Date of Joining of Employee is
		String dateOfJoining = "26 May 2022";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
		LocalDate date_of_joining = LocalDate.parse(dateOfJoining, formatter2);
		String doj = date_of_joining.toString();

		Employee employee = new Employee();
		employee.setEmpId("1013984");
		employee.setEmpName("Deepali");
		employee.setEmpSalary("50000");
		employee.setEmp_dob(dob);
		employee.setEmp_doj(doj);

		System.out.println(employee.toString());

	}
}
