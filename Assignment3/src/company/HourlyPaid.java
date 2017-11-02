package company;

public class HourlyPaid extends Employee  {
	private int rate;
	private int hours;
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return (this.getRate() * this.getHours());
	}
	

}
