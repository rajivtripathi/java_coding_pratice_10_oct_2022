package CodingPractive;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "\\Hello@#$";		
		str=str.replaceAll("[^a-zA-Z0-9]", "");		
		System.out.println(str);	

	}

}
