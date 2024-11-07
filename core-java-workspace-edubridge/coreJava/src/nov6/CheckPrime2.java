package nov6;


import java.util.Scanner;


class Prime{
	int num, cnt; //instance variables
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();
	}
	
	void checkPrime() {


		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			System.out.println(num+" is prime number");
			
		}else {
			System.out.println("Not prime number");
		}
	}
	
}


public class CheckPrime2 {


	public static void main(String[] args) {
		System.out.println("Main method");
		Prime obj = new Prime();
		obj.input();
		obj.checkPrime();
		
		}
}

