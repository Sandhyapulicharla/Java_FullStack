package nov5;

import java.util.Scanner;

public class LargestOf2Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a=sc.nextInt();
		System.out.println("Enter your second number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("The largest of "+a+" and "+b+" is "+a);
		}
		else {
			System.out.println("The largest of "+a+" and "+b+" is "+b);
		}
		

	}

}
