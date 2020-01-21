package bootcamp4;

import java.util.ArrayList;
import java.util.List;

public class Employeeautogen{
	
	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<Employee>();
		
		char reply='y';
		//do {
			Employee e=new Employee();
			e.setEmployee_code("W0009");
			e.setEmployee_code(e.autoIncrement(e.getEmployee_code()));
			System.out.println(e.getEmployee_code());

//
	}	

}
