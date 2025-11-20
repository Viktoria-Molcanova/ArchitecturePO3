package abstractions;

import enums.FuelType;

public interface Refuelable {

	FuelType getFuelType();

	boolean fuel(FuelService gasService);
}
