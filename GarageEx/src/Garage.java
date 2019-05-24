import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> garageCapacity = new ArrayList<Vehicle>();

	public void vehicleAllCalculator() {
		int value = 0;
		for (Vehicle i : garageCapacity) {
			value = 0;
			System.out.println(i.getClass());
			if (i.getClass().getCanonicalName().equals("Car")) {
				value = value + 100 + (((Vehicle) i).getnoOfWheels() * 100);
				value = value + (((Vehicle) i).getspeed() * 10);
				System.out.println(value);
				System.out.println(i.getname());

			} else if (i.getClass().getCanonicalName().equals("Bike")) {
				value = value + 200;
				value = value + 100 + (((Bike) i).getreflectors() * 100);
				value = value + (((Vehicle) i).getspeed() * 10);
				System.out.println(value);
				System.out.println(i.getname());

			}

			else if (i.getClass().getCanonicalName().equals("APC")) {
				value = value + 500;
				value = value + 100 + (((Vehicle) i).getnoOfWheels() * 100);
				value = value + (((Vehicle) i).getspeed() * 10);
				System.out.println(value);
				System.out.println(i.getname());

			}
		}
	}

	public void individualVehicleCalculator() {
		int value = 0;
		for (Vehicle i : garageCapacity) {
			if (i.getcolour() == "Black") {
				value = value + 50;
			} else if (i.getcolour() == "Blue") {
				value = value + 20;
			}
			System.out.println(value);

		}
	}

	public void individualVehicleFindCalculator(String name) {
		int value = 0;

		for (Vehicle i : garageCapacity) {
			if (i.getname() == name) {
				System.out.println("Yup, you have this car");

				if (i.getClass().getCanonicalName().equals("Car")) {
					value = value + 100 + (((Vehicle) i).getnoOfWheels() * 100);
					value = value + (((Vehicle) i).getspeed() * 10);
					System.out.println(value);
					System.out.println(i.getname());

				} else if (i.getClass().getCanonicalName().equals("Bike")) {
					value = value + 200;
					value = value + 100 + (((Vehicle) i).getnoOfWheels() * 100);
					value = value + (((Vehicle) i).getspeed() * 10);
					System.out.println(value);
					System.out.println(i.getname());

				}

				else if (i.getClass().getCanonicalName().equals("APC")) {
					value = value + 500;
					value = value + 100 + (((Vehicle) i).getnoOfWheels() * 100);
					value = value + (((Vehicle) i).getspeed() * 10);
					System.out.println(value);
					System.out.println(i.getname());

				}
			}
		}

	}

	public void removeVehicle(String name) {
		for (int j = 0; j < garageCapacity.size(); j++) {
			if (((Vehicle) this.garageCapacity.get(j)).getname() == name) {
				System.out.println("Removing Car" + name);
				garageCapacity.remove(j);
				j -= 1;
				System.out.println(garageCapacity);
			}
		}
	}

	public void removeVehicleViaColour(String colour) {
		for (int j = 0; j < garageCapacity.size(); j++) {
			if (((Vehicle) this.garageCapacity.get(j)).getcolour() == colour) {
				System.out.println("Removing Car " + colour);
				garageCapacity.remove(j);
				j -= 1;
				System.out.println(garageCapacity);
			}
		}
	}
	// }

	public void removeAllVehicles() {

		for (int j = 0; j < garageCapacity.size(); j++) {

			// for (Vehicle i : garageCapacity) {
			System.out.println("Removing Vehicle");
			garageCapacity.remove(j);
			j -= 1;
		}
	}

	public void removeVehicleBikeAccesories(String accessory) {
		for (int j = 0; j < garageCapacity.size(); j++) {
			if (((Bike) this.garageCapacity.get(j)).getaccesories() == accessory) {
				System.out.println("Removing Bike " + accessory);
				garageCapacity.remove(j);
				j -= 1;
				System.out.println(garageCapacity);
			}
		}
	}

	public void removeVehicleBikev2() {
		// garageCapacity.removeAll(garageCapacity.stream().filter(x -> !(x instanceof
		// Bike)).collect(Collectors.toList()));
		// System.out.println(garageCapacity);
		// return garageCapacity.stream().filter(x -> !(x instanceof
		// Bike)).collect(Collectors.toList()));

	}

	public void cleanse() {
		garageCapacity.clear();
		System.out.println(garageCapacity);

	}

	public void addAnCar(int noOfWheels, String colour, String make, int speed, String name) {
		Car newCar = new Car(noOfWheels, colour, speed, make, name);
		garageCapacity.add(newCar);
		System.out.println(garageCapacity);
	}

	public void addAnVehicle(String car, int noOfWheels, String colour, String make, int speed, String name) {
		Car newCar = new Car(noOfWheels, colour, speed, make, name);
		garageCapacity.add(newCar);
		System.out.println(garageCapacity + "Adding a Car");
	}

	public void addAnVehicle(String Bike, int noOfWheels, String colour, int speed, String name, String accesories,
			int reflectors) {
		Bike newBike = new Bike(noOfWheels, colour, speed, name, accesories, reflectors);
		garageCapacity.add(newBike);
		System.out.println(garageCapacity + "Adding a Bike");
	}

	public void addAnVehicle(String aPC, int noOfWheels, String colour, int speed, String name, String camoColour) {
		APC newAPC = new APC(noOfWheels, colour, speed, name, camoColour);
		garageCapacity.add(newAPC);
		System.out.println(garageCapacity + "Adding an APC");

	}
}

// }
// value=value+100;
// }

// garageCapacity.stream().filter(getClass());
