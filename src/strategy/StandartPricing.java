package strategy;

public class StandartPricing implements PricingStrategy{

	@Override
	public double calculatePrice(double dailyPrice, int rentedDays) {
		// TODO Auto-generated method stub
		return dailyPrice*rentedDays;
	}

	
}
