
public class Bike extends Vehicle {

	private String accesories;
	private int reflectors;

	public Bike(int noOfWheels, String colour, int speed, String name, String accesories, int reflectors) {
		super(noOfWheels, colour, speed, name);
		this.accesories = accesories;
		this.reflectors = reflectors;
	}

	public void setaccesories(String accesories) {
		this.accesories = accesories;
	}

	public String getaccesories() {
		return this.accesories;

	}

	public void setreflectors(int reflectors) {
		this.reflectors = reflectors;
	}

	public int getreflectors() {
		return this.reflectors;

	}
}