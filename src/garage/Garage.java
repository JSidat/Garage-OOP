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

	public void calcBill(ArrayList<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == 1)
				;
			System.out.println("Your bill is going to be £150");
		}
	}

}
