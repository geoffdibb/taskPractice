
public abstract class Vehicle {

	private int noOfWheels;
	private String colour;
	private int speed;
	private String name;

	public Vehicle(int noOfWheels, String colour, int speed, String name) {
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.speed = speed;
		this.name = name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setnoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getnoOfWheels() {
		return this.noOfWheels;
	}

	public void setncolour(String colour) {
		this.colour = colour;
	}

	public String getcolour() {
		return this.colour;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return this.speed;
	}

}
