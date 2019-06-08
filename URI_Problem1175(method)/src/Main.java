import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        reverse(list);
    }

    public static void reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list [list.length - i - 1] = temp;
        }

        for (int i = 0; i < list.length; i++)
            System.out.printf("N[%d] = %d%n", i, list[i]);
    }
}
