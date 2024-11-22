package nov21;

//default method in interface
//Lambda Expression ->you can also go through 


interface MyInterface{
	void add(); //public abstract void add();
	//java 8 features
	default void display() {
		System.out.println("Display method");
	}
}


class MyClass implements MyInterface{


	@Override
	public void add() {
		System.out.println("Add method");
		
	}
	public void display() {
		System.out.println("overriden Display method");
	}
	
}


public class DefaultMethodMain {


	public static void main(String[] args) {
		MyClass mobj = new MyClass();
		mobj.add();
		mobj.display();


	}


}

