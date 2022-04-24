package CodingPractive;

public class ArrayPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a= new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int[] x: a) {
			
			for(int b: x) {
				
				System.out.println(b);
			}
			
			
			
		}

	}

}
