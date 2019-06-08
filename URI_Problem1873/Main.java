import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    input.nextLine();

    for (int i = 0; i < n; i++) {
      String r = input.next();
      String s = input.next();

      if (r.equals(s)) {
				System.out.println("empate");
			} else if (r.equals("tesoura") && (s.equals("papel") || s.equals("lagarto"))
					|| r.equals("papel") && (s.equals("pedra") || s.equals("spock"))
					|| r.equals("pedra") && (s.equals("lagarto") || s.equals("tesoura"))
					|| r.equals("lagarto") && (s.equals("spock") || s.equals("papel"))
					|| r.equals("spock") && (s.equals("lagarto") || s.equals("papel"))) {
				System.out.println("rajesh");
			} else {
				System.out.println("sheldon");
			}
    }
  }
}
