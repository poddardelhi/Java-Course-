package classes.ha.main;

public class User {
	private String name;
	private String surname;
	private String userName;
	private String password;
	private int id;
	private String address;
	private int phoneNumber;
	
	public User(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.userName = userName;
		this.password = password;
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}



class Cashier extends User{
	private int internalNumber;
	private double baseSalary;
	private double workHours;
	public Cashier(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber, int internalNumber, double baseSalary, double workHours) {
		super(name, surname, userName, password, id, address, phoneNumber);
		this.internalNumber = internalNumber;
		this.baseSalary = baseSalary;
		this.workHours = workHours;
	}
	public int getInternalNumber() {
		return internalNumber;
	}
	public void setInternalNumber(int internalNumber) {
		this.internalNumber = internalNumber;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	
	public void printInfo() {
		System.out.println( "Cashier [internalNumber=" + internalNumber + ", baseSalary=" + baseSalary + ", workHours=" + workHours
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getUserName()=" + getUserName()
				+ "]");
	}
	
	
}



class SimpleUser extends User{

	public SimpleUser(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber) {
		super(name, surname, userName, password, id, address, phoneNumber);
	
	}
	int calBonus(){
		int bonus=0;
		return bonus;
	}
	void printInfo(){
		System.out.println("SimpleUser [calBonus()=" + calBonus() + ", getId()=" + getId() + ", getAddress()=" + getAddress()
		+ ", getPhoneNumber()=" + getPhoneNumber() + ", getName()=" + getName() + ", getSurname()="
		+ getSurname() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword()
		+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
		+ "]");
	}
	
	
}



class LoyalCustomer extends User{
	public LoyalCustomer(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber) {
		super(name, surname, userName, password, id, address, phoneNumber);
		
	}
	private int bonus;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	int calcBonus(){
		return(10*(getBonus()/100));
	}
	void printInfo(){
		System.out.println("LoyalCustomer [bonus=" + bonus + ", calcBonus()=" + calcBonus() + "]");
	}
	
}


class CustomerEmp extends User{
	private int bonus;

	public CustomerEmp(String name, String surname, String userName, String password, int id, String address,
			int phoneNumber, int bonus) {
		super(name, surname, userName, password, id, address, phoneNumber);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	int calBonus(){
		return (50* (getBonus()/100));
	}

	void printInfo(){
		System.out.println("LoyalCustomer [bonus=" + bonus + ", calcBonus()=" + calBonus() + "]");
	}
	
}



