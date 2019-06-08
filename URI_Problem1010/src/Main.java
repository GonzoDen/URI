import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int code1, code2, unit1, unit2;
        double price1, price2, total;
        code1 = input.nextInt();
        unit1 = input.nextInt();
        price1 = input.nextDouble();
        code2 = input.nextInt();
        unit2 = input.nextInt();
        price2 = input.nextDouble();
        total = (unit1*price1)+(unit2*price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }

}