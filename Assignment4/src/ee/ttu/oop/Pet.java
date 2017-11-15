package ee.ttu.oop;

import inheritedClass.*;

public interface Pet {
	public String getName();
	public void setName(String name);
	public void play();

	
	public static void main(String[] args) {
		Animal a;
		Spider s= new Spider();
		s.eat();
		s.walk();
		Pet p=null;
		Cat c =new Cat("Tom");
		c.eat();
		c.walk();
		c.play();
		a=new Cat();
		a.eat();
		a.walk();
		p.setName("Mr.Whiskers");
		p.play();
		
		Fish f=new Fish();
		f.setName("Guppy");
		f.eat();
		f.walk();
		f.play();
		a=new Fish();
		playWithAnimal(s);
		playWithAnimal(c);
	}
		public static void playWithAnimal(Animal a) {
			if(a instanceof Pet) {
			Pet p =
			(Pet)a;
			p.play();
			} else {
			System.out.println("Danger! Wild Animal");
			}
		
	}

}
