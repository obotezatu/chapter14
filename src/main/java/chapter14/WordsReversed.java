//14.9
package chapter14;

import java.util.Arrays;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;

public class WordsReversed {

		private static final String DELIMITER = " ";

		public static void main(String[] args) {

			String text = null;
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Input a phrase: ");
				text = scanner.nextLine();
			}
			String reversedPhrase = Arrays.stream(text.split(DELIMITER)).map(word -> new StringBuilder(word).reverse().toString()).collect(joining(DELIMITER));
			System.out.println(String.format("---------------------------------%nReversed phrase: %n%s", reversedPhrase));
		}
	}

