package abstractions;

import enums.FuelType;

public interface FuelService {
	boolean hasFuel(FuelType fuelType);
	default void fuel(FuelType fuelType) {

		if (!hasFuel(fuelType)) {
			throw new IllegalStateException();
		}

		System.out.println("Заправка машины (" + fuelType.toString() + ")");
	}

}
