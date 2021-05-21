package abstractionexample;


public class Runner {

	public static void main(String[] args) {
			
		Car eCar = new ElectricCar("Mazda", "Mx-5", "1992");
		Car gasCar = new GasCar("Mazda", "78-z", "1980");
		Garage garage = new Garage();
		
		
		garage.addVehicle(eCar);
		garage.addVehicle(gasCar);
		garage.removeVehicle(eCar);
		garage.removeVehicle(gasCar);
		eCar.accelerate();
	}
	
	
	DrivingBehavior car = new GasCar("Maza", "787b", "1992");

}
