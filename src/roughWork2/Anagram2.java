package roughWork2;

public class Anagram2 {

	public static void main(String[] args) {
		
	String str1 ="RAJIV";
	String str2 ="RAJIV";
	
	System.out.println(" string is "+isAnagram(str1,str2));	

	}	
	
	public static Boolean isAnagram(String str1,String str2) {
		
		String str =null;
		//String str1 ="RAJIV";
		//String str2 ="JIVRA";
		if(str1.length()!=str2.length()) {
			System.out.println(" Lengths not same ");
			return false;
		}
		
		for (int i = 0; i < str1.length(); i++) {			
			char c1=str1.charAt(i);	
			int index=str2.indexOf(c1);
			
			if(index==-1) {
				System.out.println(" Character not found "+index);
				return false;
			}
			if(index!=-1) {	
				
				System.out.println("===i==="+i);
				System.out.println("===index==="+index);
				str2=str2.substring(0, index)+ str2.substring(index+1, str2.length());	
				System.out.println("===str2=="+str2);
			}				
			
		}	
		
		return true;
	}
	

}
