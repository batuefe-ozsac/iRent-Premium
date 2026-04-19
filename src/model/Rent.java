package model;

public class Rent {

	private String id; 
	private Car car;
	private Customer customer;
	private int rentedDays;
	private double totalPrice;
	public Rent(String id, Car car, Customer customer, int rentedDays, double totalPrice) {
		super();
		this.id = id;
		this.car = car;
		this.customer = customer;
		this.rentedDays = rentedDays;
		this.totalPrice = totalPrice;
	}
	public String getId() {
		return id;
	}
	public Car getCar() {
		return car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public int getRentedDays() {
		return rentedDays;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
}
