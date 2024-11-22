package questions;
abstract class Vehicle{
	abstract void move();
}
class Car extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving");
		
	}
	
}
class Bike extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Bike is moving");
		
	}
	
}
public class AbstractClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1=new Car();
		Vehicle bike1=new Bike();
		car1.move();
		bike1.move();

	}

}
