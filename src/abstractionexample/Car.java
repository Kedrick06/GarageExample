package abstractionexample;

public abstract class Car implements DrivingBehavior {
	
	private int id;
	private String manufacturer;
	private String model;
	private String dateOfCreation;
	
	public Car(String manufacturer, String model, String dateOfCreation, int id) {
		super();
		
	}
	
	public Car(String manufacturer, String model, String doc) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.dateOfCreation = doc;
	}
	
	public abstract void accelerate();
	
	public abstract void breaking();
	
	public abstract void accelerating();
	
	public abstract void addVehicle();
	
	public abstract void removeVehicle();

	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	
}
