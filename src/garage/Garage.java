package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void calcBill() {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == 1) {
				System.out.println("The bill for this car is going to be £150");

			} else if (vehicle.getId() == 2) {
				System.out.println("The bill for this motorbike is going to be £200");

			} else if (vehicle.getId() == 3) {
				System.out.println("The bill for this bus is going to be £300");

			}
		}

	}
}
