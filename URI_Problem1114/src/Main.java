import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pass = input.nextInt();

        while (pass != 2002) {
            System.out.println("Senha Invalida");

            pass = input.nextInt();

            if (pass == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
