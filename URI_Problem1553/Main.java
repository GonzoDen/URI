import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int n = input.nextInt();
			int k = input.nextInt();

			if (n == 0 && k == 0) break;

			int max = 0;
			int[] p = new int[100];
			for (int i = 0; i < n; i++) {
				int temp = input.nextInt();
				p[temp - 1]++;
				max = Math.max(temp, max);
			}
			int count = 0;
			for (int i = 0; i < max; i++) {
				if (p[i] >= k) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
