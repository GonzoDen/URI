import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;

        while (i <= num) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
