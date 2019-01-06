package chapter14;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {

		String text;
		char countedLetter;
		int count = 0;
		int fromIndex = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a phrase: ");
			text = scanner.nextLine();
			System.out.println("Input a letter: ");
			countedLetter = scanner.next().charAt(0);
		}
		while (fromIndex != -1) {
			if ((fromIndex = text.indexOf(countedLetter, fromIndex)) != -1) {
				count++;
				fromIndex++;
			}
		}
		System.out.printf("Number of characters '%s' = %d", countedLetter, count);
	}
}
