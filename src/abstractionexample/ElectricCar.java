package abstractionexample;

public class ElectricCar extends Car {
	
	public ElectricCar(String manufacturer, String model, String doc) {
	super(manufacturer, model, doc);

	}
	
	public void accelerate() {
		System.out.println("Voltage check: OK");
	}
	
	public void breaking() {
		System.out.println("Car breaking");
	}

	@Override
	public void accelerating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vehicleIteration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVehicle(String manufacturer, String model, String dateOfCreation) {
		// TODO Auto-generated method stub
		
	}
}
