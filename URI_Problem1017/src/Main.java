import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int speed =  input.nextInt();
        int dis = time * speed;
        double fuel = dis/12.0;
        System.out.printf("%.3f%n", fuel);
    }
}