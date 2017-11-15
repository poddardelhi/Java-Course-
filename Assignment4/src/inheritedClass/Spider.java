package inheritedClass;
import ee.ttu.oop.*;
public class Spider extends Animal {

	public Spider() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Spider eats insects");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
		
		System.out.println("Spider walk with 4 legs");
	}

}
