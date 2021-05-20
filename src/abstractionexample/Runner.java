package abstractionexample;

public class Runner {

	public static void main(String[] args) {
			
		Car eCar = new ElectricCar("Mazda", "Mx-5", "1992");
		Car GasCar = new GasCar("Mazda", "78-z", "1980");
		
		eCar.accelerate();
	}
	
	DrivingBehavior car = new GasCar("Maza", "787b", "1992");

}
