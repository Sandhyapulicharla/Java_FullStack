package nov12.first;
import nov12.second.Student;
public class AccessSpecifiers extends Student{
	 void accessData() {
		 System.out.println(sfees);
	 }
	public static void main(String[] args) {
		Student sobj = new Student();
		//System.out.println(sobj.sid); //private sid cannot access from anotegr class
     //  System.out.println(sobj.age); //default can be accessed
       System.out.println(sobj.sname);
      // System.out.println(sfees);
	}
}
