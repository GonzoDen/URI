import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());

		for (int j = 0; j < n; j++) {
			int p = Integer.parseInt(input.nextLine());
			int count = 1;
			String[] s = new String[p];

      for (int i = 0; i < p; i++) {
				s[i] = input.nextLine();
			}

      for (int i = 1; i < s.length; i++) {
				if (s[i - 1].equals(s[i])) {
					count++;
				}
			}
			System.out.println((count == p) ? s[0] : "ingles");
		}
	}
}
