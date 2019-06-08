import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count =  input.nextInt();

        for (int i = 0; i < count; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (b == 0) {
                System.out.println("divisao impossivel"); continue;}

                System.out.printf("%.1f%n", (double)a/b);
        }
    }
}
