package CodingPractive;

public class Recurssion_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println(fact(5));

	}

	
	// !n = n*!(n-1)
	public static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		
		n=n*fact(n-1);
		return n;
	}
	
}
