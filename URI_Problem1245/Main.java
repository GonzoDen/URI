import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true) {
      int n = input.nextInt();

      if (n == 0) break;

      int countB = 0;

      Map<Integer, String> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        int num = input.nextInt();
        String foot = input.next();
        input.nextLine();

        if (!map.containsKey(num)) {
          map.put(num, foot);
        } else {
          if (!map.containsKey(foot)) {
            countB++;
          }
        }
      }

      System.out.println(countB);

      countB = 0;
    }
  }
}
