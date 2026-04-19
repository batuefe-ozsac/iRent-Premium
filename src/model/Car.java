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
	
	public abstract String getCarType();
	
	public String getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getDailyPrice() {
		return dailyPrice;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
}
