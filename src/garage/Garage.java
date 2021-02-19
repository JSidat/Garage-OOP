package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(int id) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == id) {
				vehicles.remove(vehicle);
				break;
			}
		}
	}

	public void calcBill() {
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				System.out.println("The bill for this car is going to be £150");

			} else if (vehicle instanceof Motorbike) {
				System.out.println("The bill for this motorbike is going to be £200");

			} else if (vehicle instanceof Bus) {
				System.out.println("The bill for this bus is going to be £300");
			}
		}
	}

	public void emptyGarage() {
		vehicles.removeAll(vehicles);
	}

	public void removeMultipleVehiclesByType(String vehicleType) {
		for (Vehicle vehicle : new ArrayList<>(vehicles)) {
			if (vehicle.getClass().getTypeName().contains(vehicleType)) {
				vehicles.remove(vehicle);
			}
		}
	}

}
