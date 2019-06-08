import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (input.hasNextLine()) {
      String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
      String s = input.nextLine();

      String message = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c != 'Q' && c != 'A' && c != 'Z' && c != '`') {
					for (int j = 1; j < keyboard.length(); j++) {
						if (c == keyboard.charAt(j)) {
							c = keyboard.charAt(j - 1);
						}
					}
				}
				message += c;
			}
			System.out.println(message);

    }
  }
}
