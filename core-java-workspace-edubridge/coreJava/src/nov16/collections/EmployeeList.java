package nov16.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	private int eid;
	private String ename;
	private float esalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
class EmployeeSortID implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEid()>o2.getEid())
			return -1;
		else if(o1.getEid()<o2.getEid())
			return 1;
		else
			return 0;
	}
	
}

//sorting based on name
class EmployeeSortName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEname().compareTo(o2.getEname())<0)
			return -1;
		else if(o1.getEname().compareTo(o2.getEname())>0)
			return 1;
		else
			return 0;
	}
}

//sort based fees
class SortEmployeeSalary implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEsalary()<o2.getEsalary())
			return -1;
		else if(o1.getEsalary()>o2.getEsalary())
			return 1;
		else 
			return 0;
	}
	
}
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> elist=new LinkedList<>();
		Employee e1=new Employee(1,"Ram",500000);
		Employee e2=new Employee(2,"Suresh",700000);
		Employee e3=new Employee(3,"Geetha",900000);
		Employee e4=new Employee(4,"Seetha",400000);
		Employee e5=new Employee(5,"Mahesh",600000);
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		System.out.println(elist);
		
	    Iterator<Employee> itobj = elist.iterator();
		
	    System.out.println("--------------------------");
		System.out.println("eId\teName\teSalary");
		System.out.println("--------------------------");
		while(itobj.hasNext()) {
			Employee e=itobj.next();
			//System.out.println(itobj.next());
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());
		

	}
	System.out.println("--------------------------");

}
}
