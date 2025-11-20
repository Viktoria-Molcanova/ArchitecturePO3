package concrete;

import abstractions.GasStation;
import enums.FuelType;
import enums.WipablePart;

public class UniversalGasStation implements GasStation {

	@Override
	public boolean hasFuel(FuelType fuelType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canWipe(WipablePart wipable) {
		return true;
	}

}
