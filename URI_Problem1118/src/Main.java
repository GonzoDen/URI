import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        double sum = 0;
        double media;
        boolean run = true;

        while (true) {
            double num = input.nextDouble();

            if (num >= 0 && num <= 10) {
                n++;
                sum += num;

                if (n == 2) {
                    media = sum / 2;
                    System.out.printf("media = %.2f%n", media);
                    System.out.println("novo calculo (1-sim 2-nao)");

                    int request = input.nextInt();

                    while (true) {
                        if (request == 1) {
                            n = 0;
                            sum = 0;
                            break;
                        } else if (request == 2) {
                            run = false;			//this would then terminate the main loop
                            break;
                        } else {
                            System.out.println("novo calculo (1-sim 2-nao)");
                            request = input.nextInt();
                        }
                    }

                    if (!run)
                        break;

                }
            } else
                System.out.println("nota invalida");
        }

    }
}
