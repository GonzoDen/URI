import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true) {

    int n = input.nextInt();

    if (n == 0) break;

    int[] list = new int[n];

    int[] temp = new int[n];
    int countExt = 0;

    for (int i = 0; i < n; i++) {
      list[i] = input.nextInt();
      temp[i] = list[i];
    }

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        if ((list[i] >= temp [n-1] && list[i] >= temp[i+1]) || (list[i] <= temp [n-1] && list[i] <= temp[i+1])) {
          countExt++;
        }
      } else if (i > 0 && i < n-1) {
          if ((list[i] >= temp [i-1] && list[i] >= temp[i+1]) || (list[i] <= temp [i-1] && list[i] <= temp[i+1])) {
            countExt++;
          }
      } else {
          if ((list[i] >= temp [i-1] && list[i] >= temp[0]) || (list[i] <= temp [i-1] && list[i] <= temp[0])) {
            countExt++;
          }
      }
    }

    System.out.println(countExt);

  }
}
}
