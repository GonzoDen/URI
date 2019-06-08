import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.nextLine();

		for (int i = 0; i < x; i++) {
			String s = input.nextLine();

			int n = input.nextInt();
			input.nextLine();

			System.out.println(cipher(s, n));
		}
	}

	static String cipher(String s, int n) {
		String str = "";
		char c;

		for (int j = 0; j < s.length(); j++) {
			c = s.charAt(j);
			c -= n;
			if (c < 65) {
				c = (char) (65 - c);
				c = (char) (91 - c);

			}
			str += c;

		}
		return str;
	}

}
