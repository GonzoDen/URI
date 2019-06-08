import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());

		for (int x = 0; x < n; x++) {
			String str = input.nextLine();
			char c;

			char[] ch = new char[26];
			boolean[] b = new boolean[26];
			int countB = 0;

			for (int i = 0; i < 26; i++) {
				ch[i] = (char) (i + 97);
			}

			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				for (int j = 0; j < ch.length; j++) {
					if (c == ch[j]) {
						b[j] = true;
					}
				}
			}

			for (int i = 0; i < 26; i++) {
				if (b[i] == true) {
					countB++;
				}
			}

			if (countB == 26) {
				System.out.println("frase completa");
			} else if (countB >= 26 / 2) {
				System.out.println("frase quase completa");
			} else {
				System.out.println("frase mal elaborada");
			}
		}
	}
}
