package strategy;

public interface PricingStrategy {

	public double calculatePrice(double dailyPrice, int rentedDays);
	
}
