package vowelorcon;

import java.util.Scanner;

public class VowelOrCon {

	public static void main(String[] args) {
		String []vowels = {"a","e","i","o","u"};
		Scanner sys = new Scanner(System.in);
		System.out.println("enter the letter");
		String letter = sys.next();
		sys.close();
		String result = "consonent";
		for (int i =0; i < vowels.length; i++) {
			if (vowels[i] .equals(letter)) {
				result = "vowels";
			}
		}
		System.out.println("given letter is an "+result);
		

	}

}
