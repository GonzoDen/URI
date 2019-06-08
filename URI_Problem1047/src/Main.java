import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        final int HOUR = 60;
        final int DAY = 24;

        int startHour = input.nextInt();
        int startMin = input.nextInt();
        int finishHour = input.nextInt();
        int finishMin = input.nextInt();

        int timeStart = startHour * HOUR + startMin;
        int timeFinish = finishHour * HOUR + finishMin;

        if (timeFinish > timeStart) {
            int duration = timeFinish - timeStart;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration/HOUR, duration%HOUR);
        }
        else {
            int duration = timeFinish - timeStart + HOUR*DAY;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration/HOUR, duration%HOUR);
        }
    }
}
