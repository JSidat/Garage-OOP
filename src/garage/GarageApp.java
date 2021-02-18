package garage;

public class GarageApp {

	public static void main(String[] args) {

		Vehicle car1 = new Car("Mercedes", "A-class", "black", 1, 4);

		Vehicle motorbike1 = new Motorbike("Bmw", "S100RR", "Grey", 2, 3);

		Vehicle bus1 = new Bus("Volvo", "longline", "Red", 3, 12);

		Garage garage = new Garage();

		garage.addVehicle(bus1);
		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
	}

}
