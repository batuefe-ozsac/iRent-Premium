package repository;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import model.Customer;
import model.Rent;

public class InMemoryDatabase {

	
	private static InMemoryDatabase instance = null;
	private List<Car> cars= new ArrayList<>();
	private List<Customer> customers= new ArrayList<>();
	private List<Rent> rents= new ArrayList<>();
	
	private InMemoryDatabase()
	{
	}

	public static InMemoryDatabase getInstance() {
        if (instance == null) {
            instance = new InMemoryDatabase();
        }
        return instance;
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

	
	
	

}
