import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int fac = 1;

        for (int i = 1; i <= num; ++i) {
            fac = fac*i;
        }

        System.out.println(fac);
    }
}