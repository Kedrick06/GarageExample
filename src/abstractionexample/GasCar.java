package abstractionexample;

public class GasCar extends Car{
	
	public GasCar(String manufacturer, String model, String doc) {
		super(manufacturer, model, doc);
	}
	
	public void accelerate() {
		System.out.println("Car accelerating");
	}
	
	public void breaking() {
		System.out.println("Car breaking");
	}

	@Override
	public void accelerating() {
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

}
