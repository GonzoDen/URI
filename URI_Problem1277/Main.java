import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int y = input.nextInt();

		for (int x = 0; x < y; x++) {

			int n = input.nextInt();

			String[] s = new String[n];
			String[] a = new String[n];

			for (int i = 0; i < n; i++) {
				s[i] = input.next();
			}

			int[] countP = new int[n];
			int[] countA = new int[n];
			int[] countM = new int[n];

			boolean first = true;

			for (int i = 0; i < n; i++) {
				a[i] = input.next();
				for (int j = 0; j < a[i].length(); j++) {
					char c = a[i].charAt(j);
					if (c == 'P') {
						countP[i]++;
					} else if (c == 'A') {
						countA[i]++;
					} else {
						countM[i]++;
					}
				}
				if (countP[i] * 100 / (a[i].length() - countM[i]) < 75) {
					if (first == false) {
						System.out.print(" ");
					}
					System.out.print(s[i]);
					first = false;
				}
				if (i == n - 1) {
					System.out.println();
				}
			}
		}
	}
}
