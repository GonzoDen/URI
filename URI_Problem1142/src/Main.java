import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print(c + " ");
            System.out.println("PUM");

            a += 4;
            b += 4;
            c += 4;
        }
    }
}
