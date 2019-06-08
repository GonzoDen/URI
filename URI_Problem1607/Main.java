import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++) {
			String s1 = input.next();
			String s2 = input.next();

			int sum = 0;

			// if (s1.length() == s2.length()) {
				for (int j = 0; j < s1.length(); j++) {
					if (s2.charAt(j) > s1.charAt(j)) {
						sum += s2.charAt(j) - s1.charAt(j);
					} else if (s1.charAt(j) > s2.charAt(j)) {
						sum += 26 - (s1.charAt(j) - s2.charAt(j));
					}
				}
				System.out.println(sum);
			// }
		}
	}
}
