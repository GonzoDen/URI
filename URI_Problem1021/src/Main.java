import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double value;
        value = input.nextDouble();

//        System.out.println("NOTAS:");
//        System.out.printf("%.0f nota(s) de R$ 100,00%n", Math.floor(value/100));
//        System.out.printf("%.0f nota(s) de R$ 50,00%n", Math.floor(value % 100 / 50));
//        System.out.printf("%.0f nota(s) de R$ 20,00%n", Math.floor(value % 100 % 50 / 20));
//        System.out.printf("%.0f nota(s) de R$ 10,00%n", Math.floor(value % 100 % 50 % 20/10));
//        System.out.printf("%.0f nota(s) de R$ 5,00%n", Math.floor(value % 100 % 50 % 20 % 10 / 5));
//        System.out.printf("%.0f nota(s) de R$ 2,00%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 / 2));
//
//        System.out.println("MOEDAS:");
//        System.out.printf("%.0f moeda(s) de R$ 1,00%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2));
//        System.out.printf("%.0f moeda(s) de R$ 0,50%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2 % 1/ 0.50));
//        System.out.printf("%.0f moeda(s) de R$ 0,25%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 / 0.25));
//        System.out.printf("%.0f moeda(s) de R$ 0,10%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 / 0.10));
//        System.out.printf("%.0f moeda(s) de R$ 0,05%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10 / 0.05));
//        System.out.printf("%.0f moeda(s) de R$ 0,01%n", Math.floor(value % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10 % 0.05 / 0.01));

//        System.out.println("NOTAS:");
//        System.out.printf("%d nota(s) de R$ 100,00%n", (int)(value/100));
//        System.out.printf("%d nota(s) de R$ 50,00%n", (int)(value % 100 / 50));
//        System.out.printf("%d nota(s) de R$ 20,00%n", (int)(value % 100 % 50 / 20));
//        System.out.printf("%d nota(s) de R$ 10,00%n", (int)(value % 100 % 50 % 20/10));
//        System.out.printf("%d nota(s) de R$ 5,00%n", (int)(value % 100 % 50 % 20 % 10 / 5));
//        System.out.printf("%d nota(s) de R$ 2,00%n", (int)(value % 100 % 50 % 20 % 10 % 5 / 2));
//
//        System.out.println("MOEDAS:");
//        System.out.printf("%d moeda(s) de R$ 1,00%n", (int)(value % 100 % 50 % 20 % 10 % 5 % 2));
//        System.out.printf("%d moeda(s) de R$ 0,50%n", (int)(value * 100 % 100 / 50 ));
//        System.out.printf("%d moeda(s) de R$ 0,25%n", (int)(value * 100 % 100) % 50 / 25 );
//        System.out.printf("%d moeda(s) de R$ 0,10%n", (int)(value * 100 % 100 % 50 % 25 / 10));
//        System.out.printf("%d moeda(s) de R$ 0,05%n", (int)(value * 100 % 100 % 50 % 25 % 10 / 5));
//        System.out.printf("%d moeda(s) de R$ 0,01%n", (int)(value * 100 % 100 % 50 % 25 % 10 % 5));
//
//
//
        System.out.println("NOTAS:");
        System.out.println((int)value/100 + " nota(s) de R$ 100.00");
        System.out.println((int)value%100/50 + " nota(s) de R$ 50.00");
        System.out.println((int)value%100%50/20 + " nota(s) de R$ 20.00");
        System.out.println((int)value%100%50%20/10 + " nota(s) de R$ 10.00");
        System.out.println((int)value%100%50%20%10/5 + " nota(s) de R$ 5.00");
        System.out.println((int)value%100%50%20%10%5/2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println((int)value%100%50%20%10%5%2/1 + " moeda(s) de R$ 1.00");
        System.out.println((int)(value*100%100)/50+ " moeda(s) de R$ 0.50");
        System.out.println((int)(value*100%100)%50/25+ " moeda(s) de R$ 0.25");
        System.out.println((int)(value*100%100)%50%25/10+ " moeda(s) de R$ 0.10");
        System.out.println((int)(value*100%100)%50%25%10/5+ " moeda(s) de R$ 0.05");
        System.out.println((int)(value*100%100)%50%25%10%5/1+ " moeda(s) de R$ 0.01");
    }
}