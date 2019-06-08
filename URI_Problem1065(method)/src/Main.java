import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if(isEven(num))
                even++;
        }

        System.out.println(even + " valores pares");
    }

    public static boolean isEven(int num) {
        if (num % 2 != 0)
            return false;

        return true;
    }
}
