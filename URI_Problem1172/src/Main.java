import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();

            if (list[i] <= 0) {
                list[i] = 1;
            }

            System.out.printf("X[%d] = %d%n", i, list[i]);
        }
    }
}
