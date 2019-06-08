import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int[] list = new int[1000];

        int num2 = 0;

        for (int i = 0; i < list.length; i++) {
            num2 = i % num;
            System.out.printf("N[%d] = %d%n", i, num2);
        }
    }
}
