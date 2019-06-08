import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = input.nextInt();

        if (count <= 0) {
            while (true) {
                count = input.nextInt();

                if (count > 0)
                    break;
            }
        }

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
