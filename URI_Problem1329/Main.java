import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(true) {
      int n = input.nextInt();

      if (n == 0) {
        break;
      }

      int countM = 0;
      int countJ = 0;

      for (int i = 0; i < n; i++) {
        int coin = input.nextInt();
        if (coin == 0)
          countM++;
        if (coin == 1)
          countJ++;
      }

      System.out.printf("Mary won %d times and John won %d times", countM, countJ); 
    }
  }
}
