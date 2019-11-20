package absPractice;
// an abstract class can implement more than one interface

public abstract class FlyingCar implements Drone, FlyingObject { //abstract class contain abstract and non abstract method

	public abstract void autopilot(); //method declared

	public void flyingFeature() { //method implemented
		System.out.println("Dreaming for a car to fly");
	}
}
