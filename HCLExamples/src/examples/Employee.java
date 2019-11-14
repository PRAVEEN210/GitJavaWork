package examples;

public class Employee {
	//all instance variables are private
	private int employeeId;
	private StringBuilder employeeName;
	private boolean employementStatus;
	private float employeeSalary;
	private String companyName;
	//default constructor
	Employee(){}
	
	//overload constructor
	public Employee(int employeeId,StringBuilder employeeName,boolean employeeStatus,float employeeSalary,String companyName) {
		
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employementStatus=employementStatus;
		this.employeeSalary=employeeSalary;
		this.companyName=companyName;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public StringBuilder getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(StringBuilder employeeName) {
		this.employeeName = employeeName;
	}
	public boolean isEmployementStatus() {
		return employementStatus;
	}
	public void setEmployementStatus(boolean employementStatus) {
		this.employementStatus = employementStatus;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

	public int compareTo(Object o) {
		Employee emp2=(Employee)o;
		return(int)(employeeId-emp2.employeeId);
	}
	
	
	

}
