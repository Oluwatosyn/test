
public class Employee {
	private String employeeId;
	private String employeeName;
	private float salary;
	
	//constructor
	public Employee() {
	}
//getter and setter
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		//return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
		//		 + "]";
		
			String str ="Employee Details:\n"+ "employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary;
			return str;
	}
	
	
	}
		

