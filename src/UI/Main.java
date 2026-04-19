package UI;

import decorate.ChildSeatDecorator;
import exception.VehicleAlreadyRentedException;
import factory.CarFactory;
import model.Car;
import model.Customer;
import service.CarService;
import service.RentalService;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== Welcome to iRent Premium System ===\n");
		
		CarFactory factory = new CarFactory();
		CarService carService = new CarService();
		RentalService rentalService = new RentalService();
		
		System.out.println("--- Initializing Fleet ---");
		Car car1 = factory.createCar("SEDAN", "35-ABC-123", "Toyota", "Corolla", 1000.0);
        Car car2 = factory.createCar("LUXURY", "34-VIP-001", "Mercedes", "S-Class", 5000.0);
        
        carService.addNewCar(car1);
        carService.addNewCar(car2);
        System.out.println("Fleet initialization complete.\n");
        
        Customer standartMusteri = new Customer("C-101", "Esma Pelin", false);
        Customer vipMusteri = new Customer("C-202", "Batu Efe", true);
        Customer yeniMusteri = new Customer("C-303", "Samet Caglar", false);

        System.out.println("\n--- Starting Rental Operations ---");
        
        rentalService.rentCar(vipMusteri, car2, 3); 

        
        System.out.println("Adding extra options to Toyota Corolla...");
        Car car1WithSeat = new ChildSeatDecorator(car1); 
        rentalService.rentCar(standartMusteri, car1WithSeat, 2);
		
		System.out.println("--- Availability Test ---");
		
		try {
            rentalService.rentCar(yeniMusteri, car2, 5); 
        } catch (VehicleAlreadyRentedException e) {
            System.out.println("System Alert: Rental failed. Reason -> " + e.getMessage());
        }
		
		
	}

}
