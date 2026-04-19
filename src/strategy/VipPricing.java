package strategy;

public class VipPricing implements PricingStrategy {

	@Override
	public double calculatePrice(double dailyPrice, int rentedDays) {
		// TODO Auto-generated method stub
		return (dailyPrice * rentedDays) * 0.9;
	}

}
