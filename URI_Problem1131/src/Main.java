import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grenais = 0;
        int interW = 0;
        int gremioW = 0;
        int empates = 0;

        while (true) {
            int inter = input.nextInt();
            int gremio = input.nextInt();

            if (inter > gremio)
                interW++;
            else if (inter < gremio)
                gremioW++;
            else
                empates++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int ans = input.nextInt();

            while (ans < 1 || ans > 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                 ans = input.nextInt();
            }

            grenais++;

            if (ans == 1) {
                continue;
            }
            else {
                break;
            }




        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interW);
        System.out.println("Gremio:" + gremioW);
        System.out.println("Empates:" + empates);

        if (interW > gremioW)
            System.out.println("Inter venceu mais");
        else if (interW < gremioW)
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");


    }
}
