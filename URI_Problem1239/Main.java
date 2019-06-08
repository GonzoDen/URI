import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(input.hasNext()) {
			String s = input.nextLine();

			int countI = 0;
			int countB = 0;

			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);

				if (c == '_') {
					countI++;
					System.out.print((countI % 2 != 0) ? "<i>" : "</i>");
				} else if (c == '*') {
					countB++;
					System.out.print((countB % 2 != 0) ? "<b>" : "</b>");
				}
				else {
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
