package CodingPractive;

import java.util.ArrayList;
import java.util.List;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABAD";

		for (int i = 0; i < s1.length(); i++) {
			// list.add(s1.charAt(i));
			for (int j = 0; j < s1.length(); j++) {

				if (i >= j && j < s1.length()
						&& s1.charAt(i - j) == s1.charAt(i + j)) {
					System.out.println("---" + s1.charAt(i - j));

				}
				
				
			}

		}

	}

}
