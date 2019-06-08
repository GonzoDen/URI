import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      int n = input.nextInt();

      if (n == 0) {
        break;
      }

      int[] list = new int[n];
      int[] temp = new int[n];


      for (int i = 0; i < n; i++) {
        list[i] = input.nextInt();
        temp[i] = list[i];
      }

      Arrays.sort(list);

      for(int i = 0; i < n; i++) {
        if (temp [i] == list[n - 2]) {
          System.out.println(i+1);
        }
      }
    }
   }
}
