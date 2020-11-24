
public class Circles {
	private final double PI = 3.14159;  // Constant for pi
	   private double radius;              // The circle's radius
//Constructor
	   public Circles() {
		   radius=0;   
	   }
	   public Circles(double r)
	   {
	      radius = r;
	   }

	   //setter and getter
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	//To get circle diameter
	 public double getDiameter()
	   {
	      return radius * 2;
	   }
	 //To calculate the circumference of a circle
	 public double getCircumference()
	   {
	      return 2 * PI * radius;
	   }

}
