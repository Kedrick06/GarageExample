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
		System.out.println("Car is accelerating");
		
	}

	@Override
	public void addVehicle() {
		System.out.println("Add electric car");
		
	}

	@Override
	public void removeVehicle() {
		System.out.println("remove vehicle");
		
	}

	

}
