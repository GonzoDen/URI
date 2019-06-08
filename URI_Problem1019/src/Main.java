import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner secs = new Scanner(System.in);
        int secs1, secshour, secsmin, secssecs;
        secs1 = secs.nextInt();
        secshour = secs1 /3600;
        secsmin = secs1 % 3600 / 60;
        secssecs = secs1 % 3600 % 60;
        System.out.println(secshour + ":" + secsmin + ":" + secssecs);

    }


}