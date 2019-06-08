import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            if (!list.contains(input))
                list.add(input);
        }
        System.out.println("Falta(m) " + (151 - list.size()) + " pomekon(s).");
    }
}
