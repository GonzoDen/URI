import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner skeiner = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(skeiner.nextLine());
			if (n == 0) {
				break;
			}
			char c;
			String str = skeiner.nextLine();
			int dir = 0;
			for (int i = 0; i < n; i++) {
				c = str.charAt(i);
				if (c == 'E') {
					dir--;
				} else {
					dir++;
				}
				if (dir == 3) {
					dir = 0;
				}
				if (dir == -1) {
					dir = 3;
				}
			}

			switch (dir) {
			case 0:
				System.out.println("N");
				break;
			case 1:
				System.out.println("L");
				break;
			case 2:
				System.out.println("S");
				break;
			case 3:
				System.out.println("O");
				break;
			}

//			n = Integer.parseInt(skeiner.nextLine());
		}
	}
}
