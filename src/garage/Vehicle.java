package garage;

public class Vehicle {

	private String make;
	private String model;
	private String colour;
	private int id;
	private int age;

	public Vehicle(String make, String model, String colour, int id, int age) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.id = id;
		this.age = age;
	}

	public void horn() {
		System.out.println("Beep beep!");
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
