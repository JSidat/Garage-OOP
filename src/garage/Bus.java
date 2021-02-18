package garage;

public class Bus extends Vehicle {

	public Bus(String make, String model, String colour, int id, int age) {
		super(make, model, colour, id, age);
		// TODO Auto-generated constructor stub
	}

	public void openDoors() {
		System.out.println("Doors opened");
	}

	public void closeDoors() {
		System.out.println("doors closed");
	}
}
