package ee.tut.oop.inventory.test;

import ee.tut.oop.inventory.domain.Book;
import ee.tut.oop.inventory.domain.Product;
import ee.tut.oop.inventory.domain.Vendor;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 =new Product(1,"My product",7,5.5);
		Product p2 =new Product(2," Another product",8,5.5);
		Product [] myProduct = {p1,p2};
		for (Product p:myProduct){
			
		System.out.println(p);
	}

		
		
		Book b1= new Book(4, "Some Book", 90, 3, null, null);
		System.out.println(b1);
		Book b2 =new Book(9, "Another Book", null, null);
		System.out.println(b2);
		
		Vendor v1= new Vendor("Vendor Company", "estonia", "Nishant", "5555");
		b1.setVendor(v1);
		System.out.println(b1);
}
}
