import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String DNA = input.nextLine();
            String resistant = input.nextLine();
            System.out.println(DNA.contains(resistant) ? "Resistente" : "Nao resistente");
        }
    }
}
