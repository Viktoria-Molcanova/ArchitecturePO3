package concrete;

import abstractions.Car;
import enums.CarType;
import enums.FuelType;
import enums.GearType;
import enums.MovementPrinciple;

public class FlyingCar extends Car {

	static final CarType TYPE = CarType.SPORT;
	static final FuelType FUEL_TYPE = FuelType.GASOLINE;

	public FlyingCar(String brand, String model, GearType gearType, int wheelsCount,
			double engineCapacity) {
		super(brand, model, TYPE, FUEL_TYPE, gearType, wheelsCount, engineCapacity);
	}

	@Override
	public MovementPrinciple getMovementPrinciple() {
		return MovementPrinciple.FLY;
	}

	@Override
	public void drive() {
		System.out.println("Летит");
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
