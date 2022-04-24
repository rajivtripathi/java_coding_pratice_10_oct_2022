package CodingPractive;

public class MaxValueInArray {

	public static void main(String[] args) {
		

		int [] x = {10,20,15,40, 5,6,0,12,41};
		int max=0;
		
		for (int i = 0; i < x.length; i++) {			
			if(x[i]>max) {				
				max=x[i];
			}			
		}
		
		System.out.println("- max value is: "+max);
	}

	}


