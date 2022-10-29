
public class Car {
	
	//attributes
	String make = "Chevrolet";
	String model = "Corvette";
	String color = "Silver";
	int year = 2022;
	double price = 78000;
	
	//methods
	void drive() {
		System.out.println("You are driving!");
	}
	
	void brake() {
		System.out.println("You Stepped on the brake!");
		
		}
	
	// toString method
	
	public String toString() {
		return make+"\n"+model+"\n"+color+"\n"+year+"\n"+price;
	}

	
}
