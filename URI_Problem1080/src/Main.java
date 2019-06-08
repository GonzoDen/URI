import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[100];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println(list[indexMax(list)]);
        System.out.println(indexMax(list)+1);
    }

    public static int indexMax(int[] list) {
        int m = 0;
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > m) {
                m = list[i];
                index = i;
            }
        }

        return index;
    }
}
