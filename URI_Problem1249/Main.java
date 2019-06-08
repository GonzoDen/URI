import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.nextLine();

			String s1 = "";

			char c;

			for(int i = 0; i < s.length(); i++) {
				c = s.charAt(i);

				if (c > 64 && c < 91) {
					c = (char)(c - 13);

				if (c < 65) {
						c = (char)(c + 26);
					}
				}

				if (c > 96 && c < 123) {
					c = (char)(c - 13);

					if (c < 97) {
						c = (char)(c + 26);
					}
				}

				s1 += c;

			}

			System.out.println(s1);
		}
	}
}
