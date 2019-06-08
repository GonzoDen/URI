import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        list[0] = input.nextInt();

        int j = 0;

        for (int i = list[0]; j < list.length; i *=2) {
            System.out.printf("N[%d] = %d%n", j, i);
            ++j;
        }
    }
}
