package CodingPractive;

public class LongestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s1 = "DCBABCDZA";
	String longest=lonestPalindrom(s1);
	System.out.println("---longest--"+longest);	
	}	
	
	public static String lonestPalindrom(String s1) {		
		String longest =s1.substring(0,1);	
		for (int i = 0; i < s1.length()/2; i++) {		
				 String temp =getMaxPalingrom(s1, i, i);
				 if(temp.length()>longest.length()) {
					  longest=temp;			 
				 }
				 temp =getMaxPalingrom(s1, i, i+1);		
				 if(temp.length()>longest.length()) {
					  longest=temp;			 
				 }							
			}	
		return longest;
	}
	
	public static String getMaxPalingrom(String s1, int start, int end) {		
		while(s1.charAt(start)==s1.charAt(end) && start>0 && end<s1.length()) {			
			start--;
			end++;			
}
	 return s1.substring(start,end+1);
	}
}
