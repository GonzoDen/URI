import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			if (a != 0 && b != 0) {

				int[] Alice = new int[10000];
				int[] Betty = new int[10000];

				for (int i = 0; i < a; i++) {
					Alice[i] = scan.nextInt();
				}

				for (int i = 0; i < b; i++) {
					Betty[i] = scan.nextInt();
				}

				int max_a, max_b;

				max_a = maximum(Alice, Betty, a, b);
				max_b = maximum(Betty, Alice, b, a);

				if (max_a < max_b) {
					System.out.println(max_a);
				} else {
					System.out.println(max_b);
				}
			} else {
				break;
			}
		}
	}

	static int maximum(int[] alice, int[] betty, int a, int b) {
		int max = 0;
		for (int i = 0; i < a; i++) {
			if (i < a - 1 && alice[i] == alice[i + 1]) {
				continue;
			}
			int j;
			for (j = 0; j < b; j++) {
				if (betty[j] == alice[i]) {
					break;
				} else if (betty[j] > alice[i]) {
					max++;
					break;
				}
			}
			if (j == b) {
				max++;
			}
		}

		return max;
	}
}
