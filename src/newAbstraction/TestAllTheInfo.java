package newAbstraction;

public class TestAllTheInfo {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.start();
		car.stop();
		
		
		
		FlyingCar car2 = new Toyota();
		car2.autopilot();
	
		
		
		Toyota ty = new Toyota();
		ty.autopilot();
		ty.brake();
		

	}

}
