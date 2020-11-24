import java.util.Scanner;
public class CirclesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		
		// Create a Scanner object for keyboard input.
	     Scanner scan = new Scanner (System.in);
	            
	      // Get the radius of a circle.
	      System.out.print("Enter the radius of a circle: ");
	      radius = scan.nextDouble();
	      
	   // Create a Circle object.
	      Circles c = new Circles(radius);
	      
	   // Display geometric info about the circle.
	      System.out.println("The circle's area is " + 
	                         c.getArea());
	      System.out.println("The circle's diameter is " + 
	                         c.getDiameter());
	      System.out.println("The circle's circumference is " +
	                         c.getCircumference());
	      
	}

}
