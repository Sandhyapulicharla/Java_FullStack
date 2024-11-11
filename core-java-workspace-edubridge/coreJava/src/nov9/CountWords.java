package nov9;

public class CountWords {



		public static void main(String[] args) {
			String s="Hello how are you?"; //4
			int wc=0;
			for(int i=0;i<s.length();i++) {
				char ch= s.charAt(i);
				
				if(ch==' ') {
					wc++;
				}
			}
			System.out.println("Number of words "+(wc+1));


		}
}
