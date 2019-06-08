import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      int n = input.nextInt();

      if (n == 0) break;

      int[] list = new int[5];



      for (int a = 0; a < n; a++) {

        int countB = 0;
        char answer = ' ';

      for (int i = 0; i < 5; i++) {
        list[i] = input.nextInt();

        if (list[i] <= 127) {
          countB++;

          switch (i) {
            case 0: answer = 'A'; break;
            case 1: answer = 'B'; break;
            case 2: answer = 'C'; break;
            case 3: answer = 'D'; break;
            case 4: answer = 'E'; break;
          }
        }


      }

      if (countB != 1) {
        System.out.println("*");
      } else {
        System.out.println(answer);
      }

    }
    }
  }
}
