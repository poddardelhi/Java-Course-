package ee.tut.oop.inventory.domain;


public class Product {
	private int productNr;
	private String productName;
	private int numberOfUnits;
	private double price;
	private Vendor vendor;
	public Product(int productNr, String productName, int numberOfUnits, double price) {
		super();
		this.productNr = productNr;
		this.productName = productName;
		this.numberOfUnits = numberOfUnits;
		this.price = price;
	}

	public Product(int productNr, String productName) {
		super();
		this.productNr = productNr;
		this.productName = productName;
	}
	public int getProductNr() {
		return productNr;
	}
	public void setProductNr(int productNr) {
		this.productNr = productNr;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "productNr=" + productNr + ", productName=" + productName + ", numberOfUnits=" + numberOfUnits
//				 +", price=" + price + "Total Values: " + calculateTotalValue();
//	}
	
	
	public double calculateTotalValue() {
		
		return this.price *this.numberOfUnits; //return the total value of items
	}
	
	@Override
	public String toString() {
		return "Product [productNr=" + productNr + ", productName=" + productName + ", numberOfUnits=" + numberOfUnits
				+ ", price=" + price + ", vendor=" + vendor + ", calculateTotalValue()=" + calculateTotalValue() + "]";
	}

	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
}
