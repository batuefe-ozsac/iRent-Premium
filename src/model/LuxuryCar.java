package model;

public class LuxuryCar extends Car {

	public LuxuryCar(String id, String brand, String model, double dailyPrice) {
		super(id, brand, model, dailyPrice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getCarType() {
		return "LUXURY";
	}

}
