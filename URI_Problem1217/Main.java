import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    int n = input.nextInt();
    input.nextLine();

    double sum = 0;
    double cost;
    int countF = 0;
    int sumCount = 0;

    for (int i = 0; i < n; i++) {
      cost = input.nextDouble();
      input.nextLine();
      String fruits = input.nextLine();

      Scanner scan = new Scanner(fruits);

      while (scan.hasNext()) {
        scan.next();
        countF++;
      }

      sumCount += countF;
      sum += cost;

      System.out.printf("day %d: %d kg%n", i+1, countF);

      countF = 0;

    }

    System.out.printf("%.2f kg by day%n", (double)sumCount/n);
    System.out.printf("R$ %.2f by day%n", sum/n);

  }
}
