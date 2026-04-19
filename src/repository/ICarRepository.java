package repository;

import model.Car;
import model.Rent;
import java.util.List;

public interface ICarRepository {
    void addCar(Car car);
    List<Car> getAllCars();
    Car getCarById(String id);
    void updateCarStatus(String id, boolean isAvailable);
    void addRent(Rent rent);
}