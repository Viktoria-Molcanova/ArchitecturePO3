package concrete;

import abstractions.Car;
import enums.CarType;
import enums.FuelType;
import enums.GearType;

public class SportCar extends Car {

	static final CarType TYPE = CarType.SPORT;
	static final FuelType FUEL_TYPE = FuelType.GASOLINE;
	static final int WHEELS = 3;

	public SportCar(String brand, String model, GearType gearType, double engineCapacity) {
		super(brand, model, TYPE, FUEL_TYPE, gearType, WHEELS, engineCapacity);
	}

	@Override
	public void drive() {
		System.out.println("Едет быстро");
	}

	@Override
	public void maintenance() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean changeGear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchHeadlights() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean switchWipers() {
		// TODO Auto-generated method stub
		return false;
	}

}
