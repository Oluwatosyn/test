
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Car sportsCar = new Car(2004, "Porsche");
		      
		      // Display the current status.
		      System.out.println("Current status of the car:");
		      System.out.println("Year model: " + sportsCar.getYearModel());
		      System.out.println("Make: " + sportsCar.getMake());
		      System.out.println("Speed: " + sportsCar.getSpeed());
		      
		      // Accelerate the car 
		      System.out.println("\nAccelerating...");
		      sportsCar.accelerate();
		      
		      // Display the speed.
		      System.out.println("Now the speed is " + sportsCar.getSpeed());
		      
		      // Brake the car .
		      System.out.println("\nBraking...");
		      sportsCar.brake();
		      
		      // Display the speed.
		      System.out.println("Now the speed is " + sportsCar.getSpeed());
		
	}

}
