import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            int n = Integer.parseInt(input.nextLine());
            String[] codes = new String[n];
            for (int i = 0; i < n; i++)
                codes[i] = input.nextLine();
            Arrays.sort(codes);
            for (String e : codes)
                System.out.println(e);
        }
    }
}
