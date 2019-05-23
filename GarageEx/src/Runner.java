public class Runner {
	public static void main(String[] args) {

		Bike Hoverbike = new Bike(2, "Blue", 30, "vehicle1", "Tassles", 5);
		Bike Pushbike = new Bike(2, "White", 5, "vehicle2", "Bell", 2);
		Car Skoda = new Car(4, "Black", 60, "vehicle3", "bad");
		Car Trabant = new Car(4, "White", 30, "vehicle4", "bad");
		Car Bondcar = new Car(4, "Black", 90, "vehicle5", "good");
		APC Tankette = new APC(8, "Green", 65, "vehicle6", "Woodland");

		Garage carStorageList = new Garage();

		carStorageList.garageCapacity.add(Hoverbike);
		carStorageList.garageCapacity.add(Pushbike);
		carStorageList.garageCapacity.add(Skoda);
		carStorageList.garageCapacity.add(Trabant);
		carStorageList.garageCapacity.add(Bondcar);
		carStorageList.garageCapacity.add(Tankette);
		// carStorageList.addAnAPC("NewTank", 20, "Black", 14, "Urban");

		// carStorageList.vehicleAllCalculator();
		// carStorageList.individualVehicleCalculator();
		// carStorageList.individualVehicleFindCalculator("vehicle5");
		// carStorageList.removeVehicle("vehicle5");
		// carStorageList.removeVehicleViaColour("Black");
		// carStorageList.removeAllVehicles();
		// carStorageList.removeVehicleBikeAccesories("Tassles");
		// carStorageList.addAnCar(48, "Mauve", "Good", 60, "vehicle7");
		// carStorageList.addAnVehicle("car", 3, "Auburn", "Bad", 77, "vehicle7");
	}
}
