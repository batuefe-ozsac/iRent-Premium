package service;


import java.util.List;

import model.Car;
import repository.ICarRepository;
import repository.InMemoryDatabase;

public class CarService {
	
	private ICarRepository carRepository;
	
	public CarService() {
		this.carRepository = InMemoryDatabase.getInstance();
	}
	
	public void addNewCar(Car car)
	{
		carRepository.addCar(car);
	}
	
	public List<Car> getCarsList()
	{
		return carRepository.getAllCars();
	}
	
	public Car findCar(String id) {
		return carRepository.getCarById(id);
	}
	
}
