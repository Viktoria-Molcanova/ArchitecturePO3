package abstractions;

import java.awt.Color;
import java.util.Objects;

import enums.CarType;
import enums.FuelType;
import enums.GearType;
import enums.MovementPrinciple;
import enums.WipablePart;

public abstract class Car implements Refuelable, Cleanable {
	public Car(
			String brand,
			String model,
			CarType type,
			FuelType fuelType,
			GearType gearType,
			int wheelsCount,
			double engineCapacity) {

		this.brand = brand;
		this.model = model;
		this.type = type;
		this.fuelType = fuelType;
		this.gearType = gearType;
		this.wheelsCount = wheelsCount;
		this.engineCapacity = engineCapacity;
	}


	private final String brand;
	private final String model;
	private final CarType type;
	private final FuelType fuelType;
	private final GearType gearType;
	private final int wheelsCount;
	private final double engineCapacity;

	private Color color;

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getWheelsCount() {
		return wheelsCount;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public CarType getType() {
		return type;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public GearType getGearType() {
		return gearType;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void drive();

	public abstract void maintenance();

	public abstract boolean changeGear();

	public abstract boolean switchHeadlights();

	public abstract boolean switchWipers();

	private boolean fogLights = false;

	public boolean switchFogLights() {
		fogLights = !fogLights;
		return fogLights;
	}


	public static final MovementPrinciple MOVEMENT_PRINCIPLE_DEFAULT = MovementPrinciple.RIDE;

	public MovementPrinciple getMovementPrinciple() {
		return MOVEMENT_PRINCIPLE_DEFAULT;
	}


	@Override
	public boolean fuel(FuelService gasService) {

		if (Objects.requireNonNull(gasService).hasFuel(fuelType)) {
			gasService.fuel(fuelType);
			System.out.println("Заправлена успешно!");
			return true;
		}
		System.out.println("Не заправлена: не оказалось нужного топлива.");
		return false;
	}

	@Override
	public boolean hasWipable(WipablePart wipable) {
		return true;
	}

	@Override
	public void wipe(CleaningService cleaningService, WipablePart... wipables) {
		Objects.requireNonNull(cleaningService);
		if (wipables == null || wipables.length == 0) {
			throw new IllegalArgumentException("wipables");
		}

		for (WipablePart wipable : wipables) {

			if (this.hasWipable(wipable) && cleaningService.canWipe(wipable))
				cleaningService.wipe(wipable);

		}
	}

}
