package ee.ttu.oop.dao;

import java.util.ArrayList;
import java.util.List;

import ee.ttu.oop.emp.Employee;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {
	private static Employee[] employeeArray = new Employee[10];
	private int id;
	public EmployeeDAOMemoryImpl() {
		// TODO Auto-generated constructor stub
	}
	 // Delete our employee record
    public void delete() {
       
		employeeArray[id] = null;
    }

    // Find an Employee record using this ID
    public  Employee findById(int id) {
        return employeeArray[id];
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public  Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
    public void update(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }
    
    public void delete(int id) {
    	employeeArray[id] =
    	null;
    	}
	@Override
	public void add(Employee emp) {
		// TODO Auto-generated method stub
		
	}
}
