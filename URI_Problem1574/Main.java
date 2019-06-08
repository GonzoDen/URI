import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = Integer.parseInt(input.nextLine());
		for (int j = 0; j < x; j++) {
			int n = Integer.parseInt(input.nextLine());
			int pos = 0;
			String[] command = new String[n];
			for (int i = 0; i < n; i++) {
				command[i] = input.nextLine();
				if (command[i].length() <= 5) {
					pos += checkCommand(command[i]);
				} else {
					Scanner inputLine = new Scanner(command[i]);
					inputLine.next();
					inputLine.next();
					int index = inputLine.nextInt();
					command[i] = command[index-1];
					pos += checkCommand(command[index-1]);
				}
			}
			System.out.println(pos);
		}
	}

	static int checkCommand(String s) {
		if (s.equals("LEFT")) {
			return -1;
		} else {
			return 1;
		}
	}
}
