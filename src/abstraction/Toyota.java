package abstraction;
// here Toyota is called concrete class
//a class can implement more than one interface
// a class can extend only one abstract class
public class Toyota extends FlyingCar implements Car, ElectricCar{
	public void price() {//in class, method can't be declared, can be implemented
		System.out.println("The price for Toyota is reasonable");
	}


	public void start() {
		System.out.println("Toyota ignite key to start the car");
		
	}

	
	public void stop() {
		
		System.out.println("Toyota use key to stop the car");
	}

	
	public void brake() {
		System.out.println("Our break is manual");
		
	}


	
	public void autopilot() {
		System.out.println("Autopilot is still a dream for toyota");
		
	}


	public void battery() {
	
		System.out.println("We are improving our battery");
		
	}


	public void weight() {
		System.out.println("Toyota have a research lab to improve Drone's weight");
		
	}


	public void shape() {
		System.out.println("We are not thiking about flying object research now");
		
	}

}
