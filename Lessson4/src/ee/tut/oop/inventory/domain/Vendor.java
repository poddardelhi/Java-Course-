package ee.tut.oop.inventory.domain;

public class Vendor {
	private String companyName;
	private String address;
	private String representattiveName;
	private String phoneNumber;
	public Vendor(String companyName, String address, String representattiveName, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.representattiveName = representattiveName;
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Vendor [companyName=" + companyName + ", address=" + address + ", representattiveName="
				+ representattiveName + ", phoneNumber=" + phoneNumber + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRepresentattiveName() {
		return representattiveName;
	}
	public void setRepresentattiveName(String representattiveName) {
		this.representattiveName = representattiveName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
