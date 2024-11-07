package nov6;



public class ReverseNumber {


	public static void main(String[] args) {
		int num=121;  //input
		int rev=0;  //output  :4321
		int num1=num;
		while(num>0) {
			int digit = num%10;  //4
			//System.out.print(digit);
			rev = rev*10+digit;  //rev = 0*10+digit=4  rev = 4*10+3=43
			num =  num/10;
		}
		
		System.out.println(rev);
		//check the number is pallandrome
		
		if(rev == num1) {
			System.out.println("Pallandrome");
		}else {
			System.out.println("Not pallandrome");
		}
	}


}

