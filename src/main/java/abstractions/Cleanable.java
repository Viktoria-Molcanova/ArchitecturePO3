package abstractions;

import enums.WipablePart;

public interface Cleanable {

	boolean hasWipable(WipablePart wipable);

	void wipe(CleaningService cleaningService, WipablePart... wipables);
}
