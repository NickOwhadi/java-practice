package day47_Blocks;

public class GasTank {
	double amount = 0.0;
	double capacity;

	public GasTank(double capacity) {
		this.capacity = capacity;
	}

	public void addGas(double g) {
		if (amount + g < capacity) {
			amount = amount + g;
		} else
			amount = capacity;
	}

	public void useGas(double g1) {
		if (amount - g1 < 0) {
			amount = 0;
		} else
			amount = amount - g1;
		;
	}

	public boolean isEmpty() {
		if (amount < 0.1) {
			return true;
		} else
			return false;
	}

	public boolean isFull() {
		if (amount > capacity - 0.1) {
			return true;
		} else
			return false;
	}

	public double getGasLevel() {
		return amount;
	}

	public double fillUp() {
		double amoun1 = amount;
		amount = capacity;
		return capacity - amoun1;
	}

}
