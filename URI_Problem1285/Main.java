import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int n = input.nextInt();
			int m = input.nextInt();

			String s = Integer.toString(n);

			int count = m - (n - 1);
			char c1;
			char c2;
			boolean exit = false;
			for (int i = n; i <= m; i++) {
				s = Integer.toString(i);
				if (s.length() > 1) {
					for (int j = 0; j < s.length(); j++) {
						exit = false;
						for (int k = j + 1; k < s.length(); k++) {
							c1 = s.charAt(j);
							c2 = s.charAt(k);
							if (c1 == c2) {
								count--;
								exit = true;
								break;
							}
						}
						if (exit) {
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
