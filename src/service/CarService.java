package service;


import java.util.List;

import model.Car;
import repository.InMemoryDatabase;

public class CarService {
	
	private InMemoryDatabase database = InMemoryDatabase.getInstance();
	
	public void addCar(Car car)
	{
		database.getCars().add(car);
	}
	
	public List<Car> getCarsList()
	{
		return database.getCars();
	}
	
}
