package company;

public abstract class Employee {
	private String name;
	public abstract int computePay();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
