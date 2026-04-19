package model;

public class Customer {

	private String customerId;
	private String name;
	private boolean isVip;
	public Customer(String customerId, String name, boolean isVip) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.isVip = isVip;
	}
	
	public String getCustomerId() { return customerId; }
	public String getName() { return name; }
	public boolean isVip() { return isVip; }
	
	
	
}
