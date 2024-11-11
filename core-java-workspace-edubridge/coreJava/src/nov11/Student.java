package nov11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Student{
	   //instance variables
	   int sid;
	   String sname;
	   float sfees; 
	   String dname;


	   public Student(){
		   sid=7;
		   sname="Manoj";
		   sfees=30000;
	   }
	   
	  void inputData() throws NumberFormatException, IOException{
	      /*Scanner sc = new Scanner(System.in);
	       
	        System.out.println("Enter id");
	         sid=sc.nextInt();
	       
	         System.out.println("Enter name");
	         sc.nextLine();
		     sname=sc.nextLine();
	        System.out.println("Enter fees");
	        sfees = sc.nextFloat();
	        System.out.println("Enter Department name");
	        sc.nextLine();
	        dname = sc.nextLine();*/
		  
		  InputStreamReader is = new InputStreamReader(System.in);
		  BufferedReader br = new BufferedReader(is);
		  
		  System.out.println("Enter id");
		  sid = Integer.parseInt(br.readLine());
		  
		  System.out.println("Enter name");
		  sname = br.readLine();
		  
		  System.out.println("enter fees");
		  sfees = Float.parseFloat(br.readLine());
		  
		  System.out.println("Enter Department name ");
          dname = br.readLine();		  
		  
	 }
	  
	  void display(){
	     System.out.println("Name="+sname);
	     System.out.println("ID="+sid);
	     System.out.println("fees="+sfees);
	     System.out.println("Department name="+dname);
	  }
}





