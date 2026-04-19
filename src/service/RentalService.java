package service;

import model.Car;
import model.Customer;
import model.Rent;
import repository.InMemoryDatabase;
import strategy.PricingStrategy;
import strategy.StandartPricing;
import strategy.VipPricing;

public class RentalService {

	private InMemoryDatabase database = InMemoryDatabase.getInstance();
	private PricingStrategy pricingStrategy;
	
	public void rentCar(Customer customer, Car car,int rentedDays)
	{
		if(customer.isVip())
		{
			pricingStrategy = new VipPricing();
		}
		else
		{
			pricingStrategy=new StandartPricing();
		}
		
		double totalPrice = pricingStrategy.calculatePrice(car.getDailyPrice(), rentedDays);
		
		Rent inf = new Rent("Car-" + car.getId() , car, customer, rentedDays, totalPrice);
		
		database.getRents().add(inf);
		car.setAvailable(false);
		
	}
}
