//14.19
package chapter14;

import java.util.Scanner;

public class DateFormat {
	private static final String[] MOUNTHS = { null, "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };

	public static void main(String[] args) {

		String text = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a phrase: ");
			text = scanner.nextLine();
		}
		String[] dateString = text.split("/");
		System.out.println(String.format("%s %s, %s",MOUNTHS[Integer.valueOf(dateString[0])],dateString[1], dateString[2] ) );
	}

}
