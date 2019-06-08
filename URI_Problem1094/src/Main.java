import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        double countC;
        double countR;
        double countS;

        int amountC = 0;
        int amountR = 0;
        int amountS = 0;

        int total = 0;

        for (int i = 0; i < count; i++) {
            int num = input.nextInt();
            char animal = input.next(".").charAt(0);


            if (animal == 'C') {
                amountC += num;
            } else if (animal == 'R') {
                amountR += num;
            } else if (animal == 'S') {
                amountS += num;
            }

            total += num;

        }

        countC = ((double) amountC / total)*100;
        countR = ((double) amountR / total)*100;
        countS = ((double) amountS / total)*100;

        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", amountC);
        System.out.printf("Total de ratos: %d%n", amountR);
        System.out.printf("Total de sapos: %d%n", amountS);
        System.out.printf("Percentual de coelhos: %.2f", countC); System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", countR); System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", countS); System.out.println(" %");
    }
}
