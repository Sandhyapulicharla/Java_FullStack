package nov11;

public class OverloadInterchangeData {
	//Function overload by interchanging datatype
	//Note: we cannot overload the method based on return type


	   int display(int i, float j) {
		   System.out.println("int and float ");
		   return 98;
	   }
	//  int display(int i, float j) {  //based on return we cannot overload the method
//		   System.out.println("int and float ");
//		   return 9;
	//   }
	   float display(float j, int i) {
		   System.out.println("float and int ");
		   return 87.4f;
	   }
	//	
	//   int display(int i, int j, int k) {
//		   return (i+j+k);
	//   }
		public static void main(String[] args) {
			OverloadInterchangeData obj = new OverloadInterchangeData();
			obj.display(56,56.4f); //add(int, float)
			obj.display(56.4f,78); //ad(float,int)


		}

}