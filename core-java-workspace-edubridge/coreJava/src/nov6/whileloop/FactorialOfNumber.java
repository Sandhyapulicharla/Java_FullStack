package nov6.whileloop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to calculate factorial");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println("The factorial of "+n+" is "+fact);
		

	}

}
