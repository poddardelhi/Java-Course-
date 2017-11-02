package company;

public class SalesCommissioned extends Employee {
	private int percentage;
	private int sales;
	
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return (this.getSales() * this.getPercentage());
	
}
}
