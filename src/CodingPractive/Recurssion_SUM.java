package CodingPractive;

public class Recurssion_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		calSum(1,5,0);
	}
	
	
	
	public static void calSum(int i, int n, int sum){		
		if(i==n){
			sum=sum+i;
			System.out.println(sum);
			return;			
		}					
		sum=sum+i;
		calSum(i+1,n,sum);
		System.out.println(i);
		
	}

}
