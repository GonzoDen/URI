import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (input.hasNext()) {
      String s = input.nextLine();
      char c;

      String s1 = "";
      String s2 = "";

      for(int i = 0; i < s.length(); i++) {
        c = s.charAt(i);

        if (c != ' ') {
          s1 += c;
        }

        if (s1.length() % 2 != 0) {
          if (c > 96 && Character.isLetter(c)) {
            c -= 32;
          }
            s2 += c;
        }
        else {
          if (c < 96 && Character.isLetter(c)) {
            c += 32;
          }
          s2 += c;
        }
      }

      System.out.println(s2);

    }
  }
}
