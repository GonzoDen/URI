import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            StringBuilder build = new StringBuilder("");
            for (int j = start; j <= end; j++)
                build.append(j);
            String reverse = build.reverse().toString();
            build.reverse();
            build.append(reverse);
            System.out.println(build);
        }
    }
}
