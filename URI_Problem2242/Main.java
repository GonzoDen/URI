import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder build = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'u' || c == 'e' || c == 'i' || c == 'o')
                build.append(c);
        }
        String a = build.toString();
        String b = build.reverse().toString();
        boolean funny = a.equals(b);
        System.out.println(funny ? "S" : "N");
    }
}
