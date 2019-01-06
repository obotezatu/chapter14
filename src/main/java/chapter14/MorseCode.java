package chapter14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class MorseCode {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>() {
			{
				put("A", ".-");
				put("B", "-...");
				put("C", "-.-.");
				put("D", "-..");
				put("E", ".");
				put("F", "..-.");
				put("G", "--.");
				put("H", "....");
				put("I", "..");
				put("J", ".---");
				put("K", "-.-");
				put("L", ".-..");
				put("M", "--");
				put("N", "-.");
				put("O", "---");
				put("P", ".--.");
				put("Q", "--.-");
				put("R", ".-.");
				put("S", "...");
				put("T", "-");
				put("U", "..-");
				put("V", "...-");
				put("W", ".--");
				put("X", "-..-");
				put("Y", "-.--");
				put("Z", "--..");
				put("1", ".----");
				put("2", "..---");
				put("3", "...--");
				put("4", "....-");
				put("5", ".....");
				put("6", "-....");
				put("7", "--...");
				put("8", "---..");
				put("9", "----.");
				put("0", "-----");
			}
		};

		String text = null;
		String choise;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("1 - To morse. ");
			System.out.println("2 - From morse. ");
			choise = scanner.nextLine();

			switch (choise) {
			case "1":
				System.out.println("Input a phrase: ");
				text = scanner.nextLine();
				System.out.println(getMorse(text, map));
				break;
			case "2":
				System.out.println("Input a morse phrase: ");
				text = scanner.nextLine();
				System.out.println(getFromMorse(text, map));
				break;
			default:
				System.out.println("Incorect choise");
				break;
			}
		}
	}

	private static String getMorse(String text, Map<String, String> map) {
		StringBuilder morsePhrase = new StringBuilder();
		String[] transforme = text.split("");
		for (int i = 0; i < transforme.length; i++) {
			if (map.containsKey(transforme[i])) {
				morsePhrase.append(map.get(transforme[i])).append(" ");
			} else {
				morsePhrase.append("   ");
			}
		}
		return morsePhrase.toString();
	}

	private static String getFromMorse(String text, Map<String, String> map) {
		// -- --- .-. ... . -.-. --- -.. .
		StringBuilder morsePhrase = new StringBuilder();
		String[] transforme = text.split(" ");
		for (int i = 0; i < transforme.length; i++) {
			if (map.containsValue(transforme[i])) {
				morsePhrase.append(getKeys(map, transforme[i]));
			} else {
				morsePhrase.append(" ");
			}
		}
		return morsePhrase.toString();
	}

	private static String getKeys(Map<String, String> map, String value) {
		String key = new String();
		for (Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals(value)) {
				key = entry.getKey();
			}
		}
		return key;
	}
}
