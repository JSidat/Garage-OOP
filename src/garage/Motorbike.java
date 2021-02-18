package garage;

public class Motorbike extends Vehicle {

	public Motorbike(String make, String model, String colour, int id, int age) {
		super(make, model, colour, id, age);

	}

	public void driveForward() {
		System.out.println("twisting handlebar to drive");
	}

	@Override
	public void startEngine() {
		System.out.println("hold down clutch and turn key");
	}

}
