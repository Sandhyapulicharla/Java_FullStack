package nov6;

import java.util.Scanner;


public class ArmstrongNumber {


	public static void main(String[] args) {
		int num,c=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		num = scanner.nextInt();
		
		int orgnum=num;
		//count the digits
		
		while(num>0) {
			c++;
			num=num/10;
		}
		
		System.out.println("No of digits "+c);
		
		num=orgnum;
		int s=0;
		while(num>0) {
			int d=num%10;
			s+=Math.pow(d, c);
			num=num/10;
		}
		
		if(orgnum==s) {
			System.out.println(orgnum+" is armstrong number");
		}else {
			System.out.println(orgnum+" is not armstrong number");
		}


	}


}
