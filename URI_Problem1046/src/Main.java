import java.io.IOException;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final int DAY = 24;
        Scanner input = new Scanner(System.in);
        int start, finish, duration;
        start = input.nextInt();
        finish = input.nextInt();

        if (finish > start) {
            duration = Math.abs(start-finish);
        }
        else {
            int temp = DAY - start;
            duration = temp + finish;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duration);


    }
}
