package garage;

public class Car extends Vehicle {

	public Car(String make, String model, String colour, int id, int age) {
		super(make, model, colour, id, age);
		// TODO Auto-generated constructor stub
	}

	public void openBoot() {
		System.out.println("boot lid open");
	}

	public void closeBoot() {
		System.out.println("Boot lid closed");
	}

	@Override
	public void startEngine() {
		System.out.println("push clutch and turn key");
	}

}
