package inheritedClass;
import ee.ttu.oop.*;

public class Fish extends Animal implements Pet {

	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Just Keep swimming");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish ear pond scum.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
		System.out.println("Fish, of course, can't walk; they swim.");
	}
	
	
	

}
