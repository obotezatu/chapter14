//14.14
package chapter14;

import java.util.Scanner;
import java.util.Arrays;


public class CompareString {

	private static final String COMPARATOR="ed";
	
	public static void main(String[] args) {
		// boolean endsWith(String suffix)
		String text = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a phrase: ");
			text = scanner.nextLine();
		}
		System.out.println("Found words: ");
		Arrays.stream(text.split(" ")).filter(word->word.endsWith(COMPARATOR)).forEach(System.out::println);
	}
}
