import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] list = new int[length];

        for (int i = 0; i < length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("Menor valor: " + list[getIndexOfMin(list)]);
        System.out.println("Posicao: " + getIndexOfMin(list));


    }

    public static int getIndexOfMin(int[] list) {
        int m = 0;
        int n = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < m) {
                m = list[i];
                n = i;
            }
        }
        return n;

    }
}
