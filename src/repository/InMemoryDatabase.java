package repository;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import model.Customer;
import model.Rent;

public class InMemoryDatabase implements ICarRepository {

	private static InMemoryDatabase instance = null;
	private List<Car> cars= new ArrayList<>();
	private List<Customer> customers= new ArrayList<>();
	private List<Rent> rents= new ArrayList<>();
	
	private InMemoryDatabase() {
	}

	public static InMemoryDatabase getInstance() {
        if (instance == null) {
            instance = new InMemoryDatabase();
        }
        return instance;
	}
	

	@Override
	public void addCar(Car car) {
		cars.add(car);
	}

	@Override
	public List<Car> getAllCars() {
		return cars; 
	}

	@Override
	public Car getCarById(String id) {
		for (Car car : cars) {
			if (car.getId().equals(id)) { 
				return car;
			}
		}
		return null; 
	}

	@Override
	public void updateCarStatus(String id, boolean isAvailable) {
		Car car = getCarById(id);
		if (car != null) {
			car.setAvailable(isAvailable); 
		}
	}



	public List<Car> getCars() {
		return cars;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Rent> getRents() {
		return rents;
	}

	@Override
	public void addRent(Rent rent) {
		rents.add(rent);
	}

}