package classes.ha.main;

public class Item {
	private String name;
	private int id;
	private int price;
	
	public Item(String name, int id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}



class ItemWithDiscount extends Item {
	
	private int discount;

	
	public ItemWithDiscount(String name, int id, int price, int discount) {
		super(name, id, price);
		this.discount = discount;
	}
	double calcDiscount(){
		double dsPrice;
		return(super.getPrice()-(super.getPrice()-discount *100));
	}
}




class ItemPartyIndependence extends Item {
	
	private int discountIndependence;
	private int discount;
	public ItemPartyIndependence(String name, int id,int price, int disountIndependence, int discount) {
		super(name, id, price);
		this.discountIndependence = disountIndependence;
		this.discount = discount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	public int getDiscountIndependence() {
		return discountIndependence;
	}
	public void setDiscountIndependence(int discountIndependence) {
		this.discountIndependence = discountIndependence;
	}
	
	public ItemPartyIndependence(String name, int id, int price, int disountIndependence) {
		super(name, id, price);
		this.discountIndependence = disountIndependence;
	}
	
	double calDisount(){
		return ( super.getPrice() -(super.getPrice()- (discount + discountIndependence)/100));
	}

	void printInfo() {
		System.out.println("FinalPriceAfterDicount =" + calDisount());
	
	}
}

	
	
class ItemInoffer extends Item{
	int buy;
	int payFor;
	
	public ItemInoffer(String name, int id, int price, int buy, int payFor) {
		super(name, id, price);
		this.buy = buy;
		this.payFor = payFor;
	}

	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	public int getPayFor() {
		return payFor;
	}

	public void setPayFor(int payFor) {
		this.payFor = payFor;
	}
	int buyMorePayLess(){
		if(buy>10){
			printInfo();
		}
		
			int difference;
			return( buy - payFor);
		}
	double calcDiscount(){
		double dsPrice;
		return (super.getPrice()*buyMorePayLess());
	}
	void printInfo(){
		if(buy>10){
			System.out.println("Only applies for purchase less than 10");
		}
		else{
			System.out.println("ItemInoffer [buy=" + buy + ", payFor=" + payFor + ", calcDiscount()=" + calcDiscount() + "]");
		}
	}

}




class ItemTakeItAll extends Item{
	private double discount;
	private int number;
	
	public ItemTakeItAll(String name, int id, int price, double discount, int number) {
		super(name, id, price);
		this.discount = discount;
		this.number = number;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	double calcDisount(){
		double dsPrice;
		return super.getPrice() *number;
	}
	void printInfo(){
		System.out.println("Name:" +super.getName()+ "ID :"+ super.getId()+"Price: " +super.getPrice() +"Discount: " +calcDisount()+ "Minimum no. required:" +number);
	}
	
}

