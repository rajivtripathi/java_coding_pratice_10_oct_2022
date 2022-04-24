package CodingPractive;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = { 1, 4, 8, 6,7,12,11};
		int max = 0;
		int secondHighest=0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {				
				max = x[i];				
			}	
		}		
		System.out.println(" max number is: "+max);
	}

}
