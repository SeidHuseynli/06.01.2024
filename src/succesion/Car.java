package succesion;

public class Car extends Vehicle {
	private int topSpeed;
	private double acceleration;

	public Car(String make, String model, int year, int topSpeed, double acceleration) {
		super(make, model, year);
		this.topSpeed = topSpeed;
		this.acceleration = acceleration;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Top Speed: " + topSpeed + " km/h");
		System.out.println("0-100 Acceleration: " + acceleration + " seconds");
	}
}
