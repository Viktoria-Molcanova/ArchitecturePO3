package concrete;

import abstractions.Car;
import enums.CarType;
import enums.FuelType;
import enums.GearType;

public class Harverster extends Car {

	static final CarType TYPE = CarType.TRUCK;
	static final int WHEELS = 6;

	public Harverster(String brand,
			String model,
			FuelType fuelType,
			GearType gearType,
			double engineCapacity) {

		super(brand, model, TYPE, fuelType, gearType, WHEELS, engineCapacity);
	}

	@Override
	public void drive() {
		System.out.println("Едет");
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


	public void sweeping() {
		System.out.println("Подметает дорогу");
	}

}
