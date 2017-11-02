package classes.ha.main;

import java.text.DateFormat;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class StoreBasket {
	private int id;
	private int netAmount;
	private int totalAmount;
	private int vat;
	private int listOfItems;
	private DateFormat dateAndTimeofPurch;
	private String address;
	private String cashierName;
	
	public StoreBasket(int id, int netAmount, int totalAmount, int vat, int listOfItems, DateFormat dateAndTimeofPurch,
			String address, String cashierName) {
		
		this.id = id;
		this.netAmount = netAmount;
		this.totalAmount = totalAmount;
		this.vat = vat;
		this.listOfItems = listOfItems;
		this.dateAndTimeofPurch = dateAndTimeofPurch;
		this.address = address;
		this.cashierName = cashierName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public int getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(int listOfItems) {
		this.listOfItems = listOfItems;
	}
	public DateFormat getDateAndTimeofPurch() {
		return dateAndTimeofPurch;
	}
	public void setDateAndTimeofPurch(DateFormat dateAndTimeofPurch) {
		this.dateAndTimeofPurch = dateAndTimeofPurch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCashierName() {
		return cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	
	
	
}

class BasketLoyal extends StoreBasket{
	private int pointAcc;
	

	public BasketLoyal(int id, int netAmount, int totalAmount, int vat, int listOfItems, DateFormat dateAndTimeofPurch,
			String address, String cashierName, int pointAcc) {
		super(id, netAmount, totalAmount, vat, listOfItems, dateAndTimeofPurch, address, cashierName);
		this.pointAcc = pointAcc;
	}
	
	int bonusCal(){
		return (super.getTotalAmount() /5);
	}


	void printInfo(){
		System.out.println("BasketLoyal [pointAcc=" + pointAcc + ", bonusCal()=" + bonusCal() + ", getId()=" + getId()
				+ ", getNetAmount()=" + getNetAmount() + ", getTotalAmount()=" + getTotalAmount() + ", getVat()="
				+ getVat() + ", getListOfItems()=" + getListOfItems() + ", getDateAndTimeofPurch()="
				+ getDateAndTimeofPurch() + ", getAddress()=" + getAddress() + ", getCashierName()=" + getCashierName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]");
	}
	             
	
}


class Basket extends StoreBasket{
	private double pointsAcc;

	public Basket(int id, int netAmount, int totalAmount, int vat, int listOfItems, DateFormat dateAndTimeofPurch,
			String address, String cashierName, double pointsAcc) {
		super(id, netAmount, totalAmount, vat, listOfItems, dateAndTimeofPurch, address, cashierName);
		this.pointsAcc = pointsAcc;
	}
	int bonusCalc(){
		return (super.getTotalAmount()/15);
	}
	
	void printInfo(){
		System.out.println("Basket [pointsAcc=" + pointsAcc + ", bonusCalc()=" + bonusCalc() + "]");
	}
	public double getPointsAcc() {
		return pointsAcc;
	}
	public void setPointsAcc(double pointsAcc) {
		this.pointsAcc = pointsAcc;
	}
	
}






