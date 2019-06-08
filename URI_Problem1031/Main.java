import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			ArrayList<Integer> list;

			int step = 1;
			while (true) {
				list = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					list.add(i + 1);
				}
				int i = 0;

				while (list.size() != 1) {

					if (i >= list.size()) {
						i = i % list.size();
					}
					if (list.indexOf(13) == i) {
						break;
					}
					list.remove(i);
					i--;
					i += step;

				}
				if (list.get(0) == 13 && list.size() == 1) {
					break;
				} else {
					step++;
				}
			}
			System.out.println(step);
		}
	}
}
