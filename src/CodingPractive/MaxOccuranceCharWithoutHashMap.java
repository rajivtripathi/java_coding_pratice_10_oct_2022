package CodingPractive;

public class MaxOccuranceCharWithoutHashMap {

	public static void main(String[] args) {
		String str = "aabbbcd";
		while (str.length() > 0) {			
			char c = str.charAt(0);	
			System.out.println(c+" "+countChar(str, c));
			System.out.println("1: str "+str);
			str=str.replace(""+c, "");
			System.out.println("2: str: "+str);
		}
	}	
	public static int countChar(String str, char ch) {			
		int count=0;		
		while(str.indexOf(ch)!=-1) {				
			count++;				
			str=str.substring(str.indexOf(ch)+1);		
		}			
		return count;
	}

}
