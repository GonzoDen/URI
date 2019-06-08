import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int n = input.nextInt();
			int m = input.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] p = new int[10001];
			int max = 0;
			for (int i = 0; i < m; i++) {
				int temp = input.nextInt();
				p[temp - 1]++;
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (p[i] > 1) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
