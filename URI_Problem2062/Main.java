import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder build = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            String a = input.next();
            if (a.length() == 3 && a.charAt(0) == 'U' && a.charAt(1) == 'R')
                build.append("URI");
            else if (a.length() == 3 && a.charAt(0) == 'O' && a.charAt(1) == 'B')
                build.append("OBI");
            else
                build.append(a);
            if (i != n - 1)
                build.append(' ');
        }
        System.out.println(build);
    }
}
