package nov8;
//Program to print last 5 prime numbers from 100 to 1
public class GeneratePrime2 {

		public static void main(String[] args) {
	    int c=0, cnt=0;
	     for(int num=100;num>=1;num--) { //1 2 3 4 5 6 7 8...100
	    	c=0;
	    	 for(int i=1;i<=num;i++) { //num=2 1 2
	    		 if(num%i==0) {
	    			 c++; 
	    		 }
	    	 }
	    	 if(c==2) {
	    		 System.out.print(num+" ");
	    		 cnt++;
	    		 if(cnt==10) {
	    			 break;
	    		 }
	    	 }
	    	 
	     }
	    // System.out.println(c);


		}
}