package model;

public class Customer {

	private String cid;
	private String firstName;
	private String lastName;
	private boolean isVip;
	public Customer(String cid, String firstName, String lastName, boolean isVip) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isVip = isVip;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	
	
	
}
