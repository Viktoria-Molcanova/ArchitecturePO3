package concrete;

import java.util.Set;

import abstractions.GasStation;
import enums.FuelType;
import enums.WipablePart;

public class GasolineOnlyStation implements GasStation {

	@Override
	public boolean hasFuel(FuelType fuelType) {
		return fuelType == FuelType.GASOLINE;
	}

	@Override
	public boolean canWipe(WipablePart wipable) {

		final Set<WipablePart> allowed = Set.of(WipablePart.WINDSHIELD, WipablePart.LIGHTS);

		return allowed.contains(wipable);
	}

}
