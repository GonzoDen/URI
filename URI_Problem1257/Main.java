import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = Integer.parseInt(input.nextLine());

		for (int x = 0; x < count; x++) {
			int sum = 0;

			int num = Integer.parseInt(input.nextLine());
			for (int i = 0; i < num; i++) {
				String s = input.nextLine();
				char c;

				for (int j = 0; j < s.length(); j++) {
					c = s.charAt(j);
					c -= 65;
					sum += (c + i + j);
				}
			}
			System.out.println(sum);
		}
	}
}
