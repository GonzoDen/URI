import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    Map<Integer, Integer> map = new HashMap<>();

    int num = 0;

    for (int i = 0; i < n; i++) {

      num = input.nextInt();
      if (!map.containsKey(num)) {
        map.put(num, 1);
      }
        else {
          map.put(num, map.get(num)+1);
        }
      }

      for (int j = 0; j <= 2000; j++) {
        if (map.containsKey(j)) {
          System.out.printf("%d aparece %d vez(es)%n", j, map.get(j));
        }

    }

  }
}
