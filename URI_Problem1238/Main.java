import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			String s1 = input.next();
			String s2 = input.next();

			char c;

			String str = "";

			int x = (s1.length() < s2.length()) ? s1.length() : s2.length();

			for (int j = 0; j < x; j++) {
				c = s1.charAt(j);
				str += c;
				c = s2.charAt(j);
				str += c;
			}

			if (s1.length() < s2.length()) {
				for (int j = x; j < s2.length(); j++) {
					c = s2.charAt(j);
					str += c;
				}
			}
			else {
				for (int j = x; j < s1.length(); j++) {
					c = s1.charAt(j);
					str += c;
				}
			}
			System.out.println(str);
		}
	}
}
