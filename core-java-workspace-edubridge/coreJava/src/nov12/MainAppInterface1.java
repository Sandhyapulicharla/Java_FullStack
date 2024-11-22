package nov12;

interface Intf11{  //using interface we can achieve 100%
	int i=10; //public static final
	void m1(); //by default methods are public abstract
	void m2();
}


interface Intf2{
	void m3();
}
class MyClass20 implements Intf11,Intf2{


	@Override
	public void m1() {
		System.out.println("m1 method of interface");
		
	}


	@Override
	public void m2() {
		
		System.out.println("m2 method of interface");
	}


	@Override
	public void m3() {
		System.out.println("m3 method of interface");
		
	}
	
}


public class MainAppInterface1 {


	public static void main(String[] args) {
		MyClass20 obj = new MyClass20();
		obj.m1();
		obj.m2();
		obj.m3();
	}


}

