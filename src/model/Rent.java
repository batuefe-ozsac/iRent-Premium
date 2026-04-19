package model;

public class Rent {

	private String rid; 
	private Car car;
	private Customer customer;
	private int rentedDays;
	private double totalPrice;
	public Rent(String rid, Car car, Customer customer, int rentedDays, double totalPrice) {
		super();
		this.rid = rid;
		this.car = car;
		this.customer = customer;
		this.rentedDays = rentedDays;
		this.totalPrice = totalPrice;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getRentedDays() {
		return rentedDays;
	}
	public void setRentedDays(int rentedDays) {
		this.rentedDays = rentedDays;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
