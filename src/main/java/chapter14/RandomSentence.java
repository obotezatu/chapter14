//14.5
package chapter14;

import java.security.SecureRandom;

public class RandomSentence {

	public static void main(String[] args) {

		final String[][] words = { { "the", "a", "one", "some", "any" }, { "boy", "girl", "dog", "town", "car" },
				{ "drove", "jumped", "ran", "walked", "skipped" }, { "to", "from", "over", "under", "on" },
				{ "the", "a", "one", "some", "any" }, { "boy", "girl", "dog", "town", "car" } };

		for (int i = 0; i < 20; i++) {
			System.out.println(generateString(words));

		}
	}

	public static String generateString(String[][] words) {

		int wordPosition;
		SecureRandom randomNumber = new SecureRandom();
		StringBuilder sentence = new StringBuilder();

		for (String[] word : words) {
			wordPosition = randomNumber.nextInt(word.length);
			sentence.append(word[wordPosition]);
			sentence.append(" ");
		}
		sentence.deleteCharAt(sentence.length() - 1);
		sentence.replace(0, 1, sentence.substring(0, 1).toUpperCase());
		sentence.append('.');
		return sentence.toString();
	}
}
