package nov11;

public class ConstructorOverloading {
	int i;
	int j;
	float k;
	float l;
	
	public ConstructorOverloading() {
		System.out.println("Constructor called without args");
	}
	

	public ConstructorOverloading(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("Constructor called with int args : "+i+" and "+j);
	}
	public ConstructorOverloading(float k, float l) {
		this.k = k;
		this.l = l;
		System.out.println("Constructor called with float args : "+k+" and "+l);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(3,4);
		ConstructorOverloading obj3=new ConstructorOverloading(5f,9f);
	}

}