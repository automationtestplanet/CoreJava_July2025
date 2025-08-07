package collections;

public class Employee implements Comparable<Employee>{

	private String empName;
	private long empSalary;
	private String empDepartment;

	public Employee(String empName, long empSalary, String empDepartment) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDepartment = empDepartment;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	@Override
	public int compareTo(Employee emp1) {
		if(this.getEmpSalary() > emp1.getEmpSalary())
			return 0;
		else {
			return -1;
		}
	}

}
