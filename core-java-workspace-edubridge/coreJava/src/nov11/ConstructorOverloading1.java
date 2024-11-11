package nov11;

public class ConstructorOverloading1 {
	int i ,j;
	  
	   
	public ConstructorOverloading1() {
		 this(9,8);
		 System.out.println("No argument constructor");
	}




	public ConstructorOverloading1(int i, int j) {
	super();
	this.i = i;
	this.j = j;
	System.out.println("With argument constructor");
}




	public static void main(String[] args) {
		ConstructorOverloading1 obj = new ConstructorOverloading1();
          System.out.println(obj.i);
          System.out.println(obj.j);
	}



}
