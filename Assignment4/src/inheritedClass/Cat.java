package inheritedClass;
import ee.ttu.oop.*;
public class Cat extends Animal implements Pet {

	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}
	

	public Cat() {
		this("Fluffy");
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(name+"likes to play with sting.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Cats like to eat spiders and fish");
		
	}

	
	

}
