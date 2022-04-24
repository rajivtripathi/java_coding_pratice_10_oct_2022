package CodingPractive;

public class RemoveDuplicateCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="HELLOO";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {			
			char c=str.charAt(i);			
			int index=str.indexOf(c,i+1);
			
			if(index==-1) {				
				sb.append(c);				
			}			
		}
				System.out.println(sb);
	}

}
