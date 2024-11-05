package nov5;

import java.util.Scanner;

public class SwitchCaseDemo3 {
	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("Area Of Different Figures");
		System.out.println("=========================");
		System.out.println("Rectangle");
		System.out.println("Square");
		System.out.println("Circle");
		System.out.println("Triangle");
		System.out.println("=========================");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		String fig=sc.next();
		switch(fig) {
		case "Rectangle":System.out.println("Enter length and width:");
	                     double l=sc.nextDouble();
	                     double w=sc.nextDouble();
	                     System.out.println("Area of Rectangle is : "+l*w);
	                     break;
		case "Square":System.out.println("Enter side:");
		              double a=sc.nextDouble();
		              System.out.println("Area of Square is : "+a*a);
		              break;
		case "Circle":System.out.println("Enter radius:");
			          double r=sc.nextDouble();
			          System.out.println("Area of Cicle is : "+3.14*r*r);
			          break;
		case "Triangle":System.out.println("Enter base and height:");
				        double b=sc.nextDouble();
				        double h=sc.nextDouble();
				        System.out.println("Area of Triangle is : "+0.5*b*h);
				        break;
		default:System.out.println("Invalid option");
		              }
		
		
	}
}
