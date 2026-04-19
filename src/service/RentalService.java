package service;

import exception.VehicleAlreadyRentedException;
import model.Car;
import model.Customer;
import model.Rent;
import repository.ICarRepository;
import repository.InMemoryDatabase;
import strategy.PricingStrategy;
import strategy.StandartPricing;
import strategy.VipPricing;

public class RentalService {

	private ICarRepository repository;
	private PricingStrategy pricingStrategy;
	
	public RentalService() {
		this.repository = InMemoryDatabase.getInstance();
	}
	
	public void rentCar(Customer customer, Car car,int rentedDays)
	{
		
		if(!car.isAvailable()) {
		    throw new VehicleAlreadyRentedException("ERROR: " + car.getBrand() + " " + car.getModel() + " is currently rented by someone else!");
		}
		
		if(customer.isVip())
		{
			pricingStrategy = new VipPricing();
		}
		else
		{
			pricingStrategy=new StandartPricing();
		}
		
		double totalPrice = pricingStrategy.calculatePrice(car.getDailyPrice(), rentedDays);
		
		Rent info = new Rent("Rent - " + car.getId(), car, customer, rentedDays, totalPrice);
		
		repository.addRent(info);
		repository.updateCarStatus(car.getId(), false);
		
		System.out.println("Renting is successful ! Customer: " + customer.getName() + " | Total Price: " + totalPrice + " TL ");
		
	}
}
