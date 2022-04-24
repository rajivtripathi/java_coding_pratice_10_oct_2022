package CodingPractive;

import java.util.ArrayList;
import java.util.List;

public class PalDemo {

	public static void main(String[] args) {
		
		PalDemo pd = new PalDemo();	    
	    String pal = pd.findLongestPalindrome("bananas");
	    System.out.println("" + pal);	    
	    pal = pd.findLongestPalindrome("abaradar121");
	    System.out.println("" + pal);
	  }	    
	  public String findLongestPalindrome(String s) {
	    String longest = s.substring(0, 1);
	    for (int i = 0; i < s.length(); i++) {        
	      // get longest palindrome for odd length (center is i)
	      String tmp = checkForEquality(s, i, i);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;
	      } // get longest palindrome for even length (center is i, i+1)
	      tmp = checkForEquality(s, i, i + 1);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;}	    }
	    
	    
	    return longest;
	  } 
	  public String checkForEquality(String s, int begin, int end) {
	    while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
	      begin--;
	      end++;
	    }
	    return s.substring(begin + 1, end);    
	  }
	}