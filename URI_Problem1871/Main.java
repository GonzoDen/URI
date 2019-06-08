import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();

		while (m != 0 && n != 0) {
			int sum = m + n;
			String s = "" + sum;

			System.out.println(s.replaceAll("0", ""));

			m = input.nextInt();
			n = input.nextInt();
		}
	}
}
