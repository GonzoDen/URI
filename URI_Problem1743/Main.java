import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean[] c = new boolean[5];

		for (int i = 0; i < 5; i++) {
			int x = input.nextInt();
			if (x == 1) {
				c[i] = true;
			}
		}
		for (int i = 0; i < 5; i++) {
			int y = input.nextInt();
			if (y == 1 && c[i] == false) {
				c[i] = true;
			} else if (y == 1 && c[i] == true) {
				c[i] = false;
			}
		}
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (c[i] == true) {
				count++;
			}
		}
		System.out.println((count == 5)? "Y" : "N");
  }
}
