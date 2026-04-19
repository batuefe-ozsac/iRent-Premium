package decorate;

import model.Car;

public abstract class CarOptionDecorator extends Car {
	protected Car decoratedCar;

    public CarOptionDecorator(Car decoratedCar) {
        super(decoratedCar.getId(), decoratedCar.getBrand(), decoratedCar.getModel(), decoratedCar.getDailyPrice());
        this.decoratedCar = decoratedCar;
    }
}
