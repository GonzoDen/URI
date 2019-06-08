import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            StringBuilder build = new StringBuilder("");
            for (int i = 0; i < input.length(); i++) {
                build.append(input.charAt(i));
                if (i != input.length() - 1)
                    build.append(' ');
            }
            int counter = input.length();
            while (true) {
                System.out.println(build);
                build.insert(0, ' ');
                build.deleteCharAt(build.length() - 1);
                build.deleteCharAt(build.length() - 1);
                counter--;
                if (counter == 0)
                    break;
            }
            System.out.println();
        }
    }
}
