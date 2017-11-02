package com.nishant.mainpackage;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private int raised;
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// method to get the total annual salary
	public int getAnnualSalary(){
		return getSalary() * 12;
	}
	//method to compute the raise
	public void raiseSalary(int percent){
		this.raised = (getAnnualSalary() + ((getAnnualSalary()*percent)/100));
	}
	
	//returns the variable "raise" 
	public Object getRaisedSalary(){
		if (this.raised==0)
		{
			return null;
		}
		else{
			return raised;
		}
			
	}
	
	// print the all information of all the employee
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", Annual Salary="+getAnnualSalary()+ ", Raised Salary=" +getRaisedSalary()+"]";
	}
	
	
}
