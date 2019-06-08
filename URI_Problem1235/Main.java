import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// int n = input.nextInt();
		// input.nextLine();
		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++) {
			String s = input.nextLine();

			for (int j = s.length() / 2; j > 0; j--) {
				System.out.print(s.charAt(j - 1));
			}
			for (int j = s.length(); j > s.length() / 2; j--) {
				System.out.print(s.charAt(j - 1));
			}
			System.out.println();
		}
	}
}
