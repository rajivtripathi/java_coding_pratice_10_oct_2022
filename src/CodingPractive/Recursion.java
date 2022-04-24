package CodingPractive;


public class Recursion {

	public static void main(String[] args) {
		
		int n=1;		
		printSum(1,5,0);		
		
	}
	

	// 1+2+3+4+5=15
	public static void printSum(int i, int n, int sum){		
		if(i==n) {			
			sum=sum+i;
			System.out.println(sum);			
			return;
			
		}
		
	sum=sum+i;		
		printSum(i+1,n,sum);
		
}
	
}

