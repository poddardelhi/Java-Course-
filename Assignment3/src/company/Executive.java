package company;

public class Executive extends Employee {
	private int increment;

	public int getIncrement() {
		return increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}

	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return this.getIncrement();
	}
	

}
