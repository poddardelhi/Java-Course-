package test;

import company.Employee;
import company.Executive;
import company.HourlyPaid;
import company.SalesCommissioned;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyPaid h1= new HourlyPaid();
		SalesCommissioned s1=new SalesCommissioned();
		Executive e1 = new Executive();
		h1.setName("Nishant");
		h1.setRate(10);
		h1.setHours(45);
		s1.setPercentage(20);
		s1.setSales(500);
		e1.setIncrement(500);
	   
		System.out.println("The total income generated by employee: " +h1.getName()+" is " +(h1.computePay()+s1.computePay()+e1.computePay()) +" ,Hours worked :"+h1.getHours()+ "\n "+ " ,Rate : " +h1.getRate() +" ,Percentage Earned: " +s1.getPercentage()+ " ,Sales Did: " +s1.getSales()+" and  Increment received: "+e1.getIncrement());
		

}
	
}
