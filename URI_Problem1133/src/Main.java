import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++){
                if (i % 5 == 2 || i % 5 == 3)
                    System.out.println(i);
            }
        }

        if (num1 > num2) {
            for (int i = num2 + 1; i < num1; i++){
                if (i % 5 == 2 || i % 5 == 3)
                    System.out.println(i);
            }
        }
    }
}
