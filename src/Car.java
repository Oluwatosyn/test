
public class Car {
	private int yearModel;	// The car's year model
	   private String make;		// The car's make
	   private int speed;		// The current speed
	   
	   //Constructor
 public Car(int y, String m)
 {
     yearModel = y;
     make = m;
     speed = 0;
  }
 
	
	//Setter
 public void setYearModel(int y) {
		yearModel= y;
	}
	
public void setMake(String m) {
		make = m;
	}
	
public void setSpeed(int s) {
		speed = s;
	}
	
	//Getter
public int getYearModel()
	   {
	      return yearModel;
	   }
public String getMake()
	   {
	      return make;
	   }
public int getSpeed()
	   {
	      return speed;
	   }
	
	//acceleration method to increase speed
 public void accelerate()
	   {
	      speed += 5;
	   }

	 //brake method to decrease speed
 public void brake()
	   {
	      speed -= 5;
	   }

}
