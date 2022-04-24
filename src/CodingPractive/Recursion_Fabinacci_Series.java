package CodingPractive;

public class Recursion_Fabinacci_Series {

	public static void main(String[] args) {
		
		int i=0, j=1, n=7;
		System.out.println(i);
		System.out.println(j);
		printFib(0,1,n-2);

	}
	
	
	// f(n) =f(n-1)+f(n-2)
	// 0 1 2 3 5 8 13 21...
	// n>=2
	static void printFib(int a, int b, int n ) {		
		if(n==0){
			return;
		}		
		int c = a+b;		
		System.out.println(c);
		printFib(b,c,n-1);			
	}
}
