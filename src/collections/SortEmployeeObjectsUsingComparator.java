package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeObjectsUsingComparator {

	public static void main(String[] args) {

		List<Integer> numbsList = new LinkedList<Integer>();
		numbsList.add(13);
		numbsList.add(11);
		numbsList.add(12);

		System.out.println("---------------Before Sorting the numbers----------------");
		System.out.println(numbsList);

		System.out.println("---------------After Sorting the numbers----------------");
		Collections.sort(numbsList);
		System.out.println(numbsList);

		List<Employee> allEmployees = new LinkedList<Employee>();
		allEmployees.add(new Employee("Ram", 100000, "Development"));
		allEmployees.add(new Employee("Krish", 80000, "DevOps"));
		allEmployees.add(new Employee("Venkat", 90000, "Testing"));
		allEmployees.add(new Employee("Kiran", 85000, "Testing"));

		System.out.println("---------------Before Sorting the Employees----------------");
		allEmployees.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpName() + "    " + eachEmp.getEmpSalary() + "   " + eachEmp.getEmpDepartment()));

		System.out.println("---------------After Sorting the Employees using Comparator----------------");
//		Collections.sort(allEmployees);
		allEmployees.sort((emp1, emp2) -> Integer.compare((int) emp1.getEmpSalary(), (int) emp2.getEmpSalary()));
		allEmployees.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpName() + "    " + eachEmp.getEmpSalary() + "   " + eachEmp.getEmpDepartment()));

		List<Employee> filteredEmpList = allEmployees.stream().filter(eachEmp -> eachEmp.getEmpSalary() <= 80000)
				.collect(Collectors.toList());

		System.out.println(filteredEmpList.size());

		List<Employee> filteredEmpList2 = allEmployees.stream()
				.filter(eachEmp -> eachEmp.getEmpDepartment().equalsIgnoreCase("Testing")).collect(Collectors.toList());
		System.out.println(filteredEmpList2.size());
		filteredEmpList2.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpName() + "    " + eachEmp.getEmpSalary() + "   " + eachEmp.getEmpDepartment()));

	}

}
