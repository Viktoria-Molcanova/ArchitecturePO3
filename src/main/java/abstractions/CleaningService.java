package abstractions;

import java.util.NoSuchElementException;

import enums.WipablePart;

public interface CleaningService {

	boolean canWipe(WipablePart wipable);


	default void wipe(WipablePart wipable) {

		if (!canWipe(wipable)) {
			throw new IllegalStateException();
		}

		switch (wipable) {
		case MIRROR -> System.out.println("Протирка зеркал");
		case WINDSHIELD -> System.out.println("Протирка лобового стекла");
		case LIGHTS -> System.out.println("Протирка фар");
		default -> throw new NoSuchElementException();
		}

	}
}
