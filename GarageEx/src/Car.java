
public class Car extends Vehicle {

	private String carMake;

	public Car(int noOfWheels, String colour, int speed, String name, String carMake) {
		super(noOfWheels, colour, speed, name);
		this.carMake = carMake;

	}

	public void setcarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getcarMake() {
		return this.carMake;

	}

}
