import java.util.Scanner;

public class Main {

  enum dir {
    N, L, S, O;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      int n = input.nextInt();

      if (n == 0) break;

      dir d = dir.N;

      String s = input.next();

      for(int i = 0; i < n; i++) {

        char c = s.charAt(i);

        if (c == 'D') {
          if (d == dir.O) {
            d = dir.N;
          } else {
            d = dir.values()[d.ordinal()+1]; // d = NORTH; d.ordinal = 0
          }
        } else {
          if (d == dir.N) {
            d = dir.O;
          } else {
            d = dir.values()[d.ordinal()-1];
          }
        }
      }

      System.out.println(d);

    }
  }
}
