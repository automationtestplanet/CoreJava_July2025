package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortEmployeeObjectsUsingComparable {

	public static void main(String[] args) {
		List<Employee> allEmployees = new LinkedList<Employee>();
		allEmployees.add(new Employee("Ram", 100000, "Development"));
		allEmployees.add(new Employee("Krish", 80000, "DevOps"));
		allEmployees.add(new Employee("Venkat", 90000, "Testing"));
		allEmployees.add(new Employee("Kiran", 85000, "Testing"));

		Collections.sort(allEmployees);
		allEmployees.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpName() + "    " + eachEmp.getEmpSalary() + "   " + eachEmp.getEmpDepartment()));

	}

}
