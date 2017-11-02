package com.nishant.mainpackage;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(1, "Nishant","Poddar", 1800);
		Employee emp2=new Employee(2, "Rakesh","Sharma",  2000);
		Employee emp3=new Employee(3, "Simon","Dsouza", 3700);
		Employee emp4=new Employee(4, "Kedi","Kshuki",  2700);
		Employee emp5=new Employee(5, "Kalam","Ray", 1980);

		
		//		Increasing the salary of all employee except emp4
		emp1.raiseSalary(50);
		emp2.raiseSalary(10);
		emp3.raiseSalary(35);
		emp5.raiseSalary(20);
		
//		printing the information of all the objects
		Employee [] myEmp = {emp1,emp2,emp3,emp4,emp5}; //creating the array of employees 
		for (Employee emp:myEmp){
			
			System.out.println(emp);
		}
		
		
		
		
	}

}
