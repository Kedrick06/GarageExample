package abstractionexample;


import java.util.ArrayList;

public class Garage {
	
 	protected String address = "1900 Pacific Ave.";
 	protected ArrayList<Car> storage = new ArrayList<>();
 	
 	
 	
 	public void removeVehicle(Car c) {
 		ArrayList<Car> storage2 = new ArrayList<>();
 		for(Car car : storage) {
 			storage2.add(car);
 		}
 		
 			
 	}
 	
 	public String getAddress() {
 		return address;
 	}
	//constructors
 		public void emptyGarage() {
 			storage.clear();
	}
 		
 		public void setStorage(ArrayList<Car> storage) {
 			this.storage = storage;
 		}
 		
 		public void addVehicle(Car c) {
 			storage.add(c);
 		}
	

	
}
