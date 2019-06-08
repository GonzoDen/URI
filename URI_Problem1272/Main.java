import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			String s1 = input.nextLine();
			char c;
			String holder = "";
			String s2 = "";

			for (int j = 0; j < s1.length(); j++) {
				c = s1.charAt(j);
				if (Character.isLetter(c)) {
					holder += c;
				}
				if (holder.length() > 0) {
					if (c == ' ' || (j == s1.length() - 1)) {
						if (s1.charAt(j) > 0) {
							s2 += holder.charAt(0);
						}
						holder = "";
					}
				}

			}
			System.out.println(s2);
		}
	}
}
