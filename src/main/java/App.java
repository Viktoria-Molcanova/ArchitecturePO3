import abstractions.Car;
import abstractions.GasStation;
import concrete.FlyingCar;
import concrete.GasolineOnlyStation;
import concrete.Harverster;
import concrete.SportCar;
import concrete.UniversalGasStation;
import enums.FuelType;
import enums.GearType;
import enums.WipablePart;


public class App {
	public static void main(String[] args) {

		Harverster harverster = new Harverster("Toyota", "321", FuelType.DIESEL, GearType.MANUAL, 1);
		SportCar sportCar = new SportCar("Polaris", "234", GearType.MANUAL, 1);
		FlyingCar flyingCar = new FlyingCar("Fly", "123", GearType.AUTO, 4, 1);

		GasStation uniGasStation = new UniversalGasStation();
		GasStation gasGasStation = new GasolineOnlyStation();

		System.out.println("\nУборочная машина:");
		harverster.drive();
		System.out.println("Попытка заправки на станции,нет ДТ:");
		harverster.fuel(gasGasStation);
		harverster.wipe(gasGasStation, WipablePart.LIGHTS, WipablePart.MIRROR);
		System.out.println("Стоимость обслуживания: " + calcMaintenance(harverster));

		System.out.println("\nСпортивная машина:");
		sportCar.drive();
		sportCar.fuel(gasGasStation);
		sportCar.wipe(gasGasStation, WipablePart.MIRROR, WipablePart.WINDSHIELD, WipablePart.LIGHTS);
		sportCar.drive();
		System.out.println("Стоимость обслуживания: " + calcMaintenance(sportCar));

		System.out.println("\nЛетающая машина:");
		flyingCar.drive();
		flyingCar.fuel(gasGasStation);
		flyingCar.wipe(gasGasStation, WipablePart.MIRROR, WipablePart.WINDSHIELD, WipablePart.LIGHTS);
		flyingCar.drive();
		System.out.println("Стоимость обслуживания  " + calcMaintenance(flyingCar));
	}

	static double calcMaintenance(Car car) {

		int wheelsCount = car.getWheelsCount();
		if (wheelsCount >= 6) {
			return 2000 * wheelsCount;
		} else {
			return 1500 * wheelsCount;
		}
	}
}
