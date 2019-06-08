import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int n = scan.nextInt(); 
			int sum = 0;
			ArrayList<Integer> a = new ArrayList<>();

			for (int i = 0; i * i <= n; i++) {
				if (i * i <= n) {
					a.add(i * i);
				}
			}
			for (int i = 0; i < a.size(); i++) {
				for (int j = 0; j < a.size(); j++) {
					sum = a.get(i) + a.get(j);
					if (sum == n) {
						System.out.println("YES");
						break;
					}
				}
				if (sum == n)
					break;
			}
			if (sum != n) {
				System.out.println("NO");
			}
		}
	}
}
