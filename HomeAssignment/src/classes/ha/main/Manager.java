package classes.ha.main;

public class Manager extends User {
	
	
	private int pin;
	public Manager(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber, int pin, int internalPhoneNumber) {
		super(name, surname, userName, password, id, address, phoneNumber);
		this.pin = pin;
		this.internalPhoneNumber = internalPhoneNumber;
		
	}
	private int internalPhoneNumber;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getInternalPhoneNumber() {
		return internalPhoneNumber;
	}
	public void setInternalPhoneNumber(int internalPhoneNumber) {
		this.internalPhoneNumber = internalPhoneNumber;
	}
ItemWithDiscount itemOne=new ItemWithDiscount("EggPLant", 1, 12, 5);
ItemPartyIndependence itemTwo=new ItemPartyIndependence("Milk", 2, 70, 2);
ItemInoffer itemThree=new ItemInoffer("Apples", 3, 5, 5, 4);
ItemTakeItAll itemFour = new ItemTakeItAll("Blanket", 3, 150, 10, 4);
 
private void offers (){
	int discountIndependence= 15;
	int discount = 45;
	int buy= 8;
	int payFor= 4;
	int number=7;
	
	itemTwo.setDiscount(discount);
	itemTwo.setDiscountIndependence(discountIndependence);
	itemThree.setBuy(buy);
	itemThree.setPayFor(payFor);
	itemFour.setNumber(number);
		
	System.out.println("hello");
}
}

