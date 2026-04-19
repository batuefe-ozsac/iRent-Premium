package factory;

import model.Car;
import model.LuxuryCar;
import model.SedanCar;

public class CarFactory {

	public Car createCar(String type, String id,String brand, String model, double dailyPrice) 
	{
		
		if(type == null) {
			return null;
		}
		
		if(type.equalsIgnoreCase("SEDAN")) 
		{
			return new SedanCar(id,brand,model,dailyPrice);
		}
		
		if(type.equalsIgnoreCase("LUXURY"))
		{
			return new LuxuryCar(id,brand,model,dailyPrice);
		}
				
		return null;
	}
}
 