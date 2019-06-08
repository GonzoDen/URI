import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int m = 0; m < t; m++) {
			int n = input.nextInt();
			int[] sheep = new int[n];
			for (int i = 0; i < n; i++) {
				sheep[i] = input.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (sheep[i] == sheep[j]) {
						sheep[j] = -1;
					}
				}
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (sheep[i] >= 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
