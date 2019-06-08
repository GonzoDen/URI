import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((b < c) && (b > a)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if ((c < b) && (c > a)) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if ((b > c) && (b < a)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if ((c > b) && (a > c)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if ((a > b) && (a < c)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if ((a < b) && (a > c)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);

        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
