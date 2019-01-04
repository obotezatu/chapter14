//14.7
package chapter14;

import java.util.Arrays;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;

public class PigLatin {

	private static final String DELIMITER = " ";

	public static void main(String[] args) {

		String text = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a phrase: ");
			text = scanner.nextLine();
		}
		String pigLatinPhrase = Arrays.stream(text.split(DELIMITER)).map(PigLatin::generatePigLatin).collect(joining(DELIMITER));
		System.out.println(String.format("---------------------------------%nPig Latin phrase: %n%s", pigLatinPhrase));
	}

	private static String generatePigLatin(String word) {
		StringBuilder pigLatin = new StringBuilder(word);
		pigLatin.append(pigLatin.charAt(0)).append("uy").deleteCharAt(0);
		System.out.println(String.format("%s -> %s", word, pigLatin.toString() ));
		return pigLatin.toString();
	}
}
