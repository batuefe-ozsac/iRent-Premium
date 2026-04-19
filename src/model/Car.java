package model;

public abstract class Car {

	private String id;
	private String brand;
	private String model;
	private double dailyPrice;
	private boolean isAvailable=true;
	public Car(String id, String brand, String model, double dailyPrice) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.dailyPrice = dailyPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
}
