package CodingPractive;

public class RemoveDuplicateCharactersBasicWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="RAJIVVGGhHHR";		
		String temp="";
		
		for(int i=0;i<s1.length();i++) {			
			char c =s1.charAt(i);			
			if(temp.indexOf(c)==-1) {				
				temp=temp+c;				
			}
			
		}		
		System.out.println(temp);		

	}

}
