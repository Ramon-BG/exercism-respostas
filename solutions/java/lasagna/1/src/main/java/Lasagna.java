public class Lasagna {

	// TODO: define the 'expectedMinutesInOven()' method
	private int expectedMinutesInOven = 40;

	public int expectedMinutesInOven() {
		return expectedMinutesInOven;
	}

	// TODO: define the 'remainingMinutesInOven()' method
	public int remainingMinutesInOven(int minutesInOven) {
		return expectedMinutesInOven - minutesInOven;
	}

	// TODO: define the 'preparationTimeInMinutes()' method
	public int preparationTimeInMinutes(int numeroDeCamadas) {
		return numeroDeCamadas * 2;
	}

	// TODO: define the 'totalTimeInMinutes()' method
	public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
		return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
	}
}