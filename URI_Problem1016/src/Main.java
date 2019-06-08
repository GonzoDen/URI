import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int dis = input.nextInt();
        int time = dis * 2;
        System.out.println(time + " minutos");
    }
}