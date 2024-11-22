package questions;
class Employee{
	void work() {
		System.out.println("Employee is working");
	}
}
class Manager extends Employee{
	void manage() {
		System.out.println("Manager is working");
	}
}
public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Manager();
		emp1.work();
		if(emp1 instanceof Employee) {
			Manager mng2=(Manager)emp1;
			mng2.manage();
		}

	}

}
