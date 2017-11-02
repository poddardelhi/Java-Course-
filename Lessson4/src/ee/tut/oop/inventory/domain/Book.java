package ee.tut.oop.inventory.domain;

public class Book extends Product {

	
	private String author;
	private String title;
	
	public Book(int productNr, String productName, int numberOfUnits, double price, String author, String title) {
		super(productNr, productName, numberOfUnits, price);
		// TODO Auto-generated constructor stub
		this.author= author;
		this.title= title;
		
	}
	public Book(int productNr, String productName, String author, String title) {
		super(productNr, productName);
		// TODO Auto-generated constructor stub
		this.author= author;
		this.title= title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", toString()=" + super.toString() + "Book Value :" +calculateTotalValue();
	}
	
public double calculateTotalValue() {
		
		return super.calculateTotalValue()*1.05; // add 5% to total values
	}
	
}
