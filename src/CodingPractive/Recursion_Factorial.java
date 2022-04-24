package CodingPractive;

public class Recursion_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		fact(1);

	}
	
	
	
	public static int fact(int n) {	
		
		if(n==1 || n==0) {			
			return 1;
		}
		int value =fact(n-1)*n;	
		System.out.println(value);
		return value;
		
	}

}
