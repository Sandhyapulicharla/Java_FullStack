package questions;
class Animal{
	void sound() {
		System.out.println("Some sound");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow");
	}
}
public class Inheritancedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1=new Dog();
		Animal cat1=new Cat();
		dog1.sound();
		cat1.sound();
	}

}
