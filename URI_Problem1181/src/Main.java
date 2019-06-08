import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double m[][] = new double[12][12];

        int l = input.nextInt();

        String t = input.next();
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        for (int j = 0; j < m[l].length; j++) {
            sum += m[l][j];
        }

        if (t.equals("S")) {
            System.out.printf("%.1f%n", sum);
        } else {
            double media = sum / 12;
            System.out.printf("%.1f%n", media);
        }
    }
}