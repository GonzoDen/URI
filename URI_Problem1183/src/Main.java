import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[12][12];

        String t = input.next();

        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        for (int i = 1; i < m.length; i++) {
            for (int k = i; k < m[i].length; k++) {
                sum += m[i - 1][k];
            }
        }

        if (t.equals("S")) {
            System.out.printf("%.1f%n", sum);
        } else {
            double media = sum / 66;
            System.out.printf("%.1f%n", media);
        }
    }
}


