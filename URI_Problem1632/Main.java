import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String input = scan.next().toUpperCase();
            int variations = 1;
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                int modifier = 2;
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'S')
                    modifier++;
                variations *= modifier;
            }
            System.out.println(variations);
        }
    }
}
