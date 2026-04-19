package decorate;

import model.Car;

public class ChildSeatDecorator extends CarOptionDecorator {
	
	public ChildSeatDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
	
	@Override
    public double getDailyPrice() {
        return decoratedCar.getDailyPrice() + 500.0; 
    }

    @Override
    public String getCarType() {
        return decoratedCar.getCarType() + " (with Child Seat)";
    }
}
