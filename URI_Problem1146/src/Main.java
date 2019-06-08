import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        while(num != 0) {
            for (int i = 1; i <= num; i++){
                if (i != num) {
                    System.out.print(i + " ");
                }
                else
                System.out.println(i);
            }
            num = input.nextInt();
        }
    }
}
