import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int alcohol = 0;
        int gasolina = 0;
        int diesel = 0;

        while (num != 4) {
            num = input.nextInt();

            if (num == 1)
                alcohol++;
            if (num == 2)
                gasolina++;
            if (num == 3)
                diesel++;
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
