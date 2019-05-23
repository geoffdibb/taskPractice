
public class APC extends Vehicle {

	private String camo;

	public APC(int noOfWheels, String colour, int speed, String name, String camo) {
		super(noOfWheels, colour, speed, name);
		// TODO Auto-generated constructor stub
	}

	public void setcamo(String camo) {
		this.camo = camo;
	}

	public String getcamo() {
		return this.camo;
	}
}
