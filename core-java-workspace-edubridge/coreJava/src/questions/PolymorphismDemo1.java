package questions;
class Shape{
	void draw() {
		System.out.println("Shape");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Rectangle");
	}
}class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Triangle");
	}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle1=new Circle();
		Shape rect1=new Rectangle();
		Shape triangle1=new Triangle();
		circle1.draw();
		rect1.draw();
		triangle1.draw();


	}

}
