package nov12;


import java.util.Scanner;


class Parent{
	private int id; //private belongs same class,
	public String name;
	protected float salary;
	
	public Parent(int id,String name, float salary) {
		System.out.println("Parent class constructor");
		this.id = id;
		this.name=name;
		this.salary=salary;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
	}
	//Run time polymorphisam
	//Function overriding
	
	void display() {
		System.out.println("Id "+id); 
			
		System.out.println("name "+name);
		System.out.println("Salary "+salary);	
		
		}
}


class Child extends Parent{ //is-A relation
	
	public Child(int id,String name,float salary) {
		super(id,name,salary); //calls parent class constructor
		System.out.println("Child class constructor");
	}
	void display() {
		//System.out.println("Id "+id); //private data cannot be inherited
		
		System.out.println("name "+name);
		System.out.println("Salary "+salary);	
		super.display(); //calls Parent class method
		}
}
public class InheritenceDemo1 {


	public static void main(String[] args) {
		Child cobj = new Child(87,"Sandhya",78654);
		//cobj.inputData();
		cobj.display();
	}


}

