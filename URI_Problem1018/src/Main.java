import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int value, value100, value50, value20, value10, value5, value2, value1;
        value = input.nextInt();
        value100 = value / 100;
        value50 = value % 100 / 50;
        value20 = value % 100 % 50 / 20;
        value10 = value % 100 % 50 % 20/10;
        value5 = value % 100 % 50 % 20 / 5;
        value2 = value % 100 % 50 % 20 % 5 / 2;
        value1 = value % 100 % 50 % 20 % 5 % 2;
        System.out.println(value);
        System.out.println(value100 + " nota(s) de R$ 100,00");
        System.out.println(value50 + " nota(s) de R$ 50,00");
        System.out.println(value20 + " nota(s) de R$ 20,00");
        System.out.println(value10 + " nota(s) de R$ 10,00");
        System.out.println(value5 + " nota(s) de R$ 5,00");
        System.out.println(value2 + " nota(s) de R$ 2,00");
        System.out.println(value1 + " nota(s) de R$ 1,00");


    }
}