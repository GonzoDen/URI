import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineCounter = 0;
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            if (lineCounter != 0)
                System.out.println();
            lineCounter++;
            String[] array = new String[n];
            int longestLength = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scan.next();
                if (longestLength < array[i].length())
                    longestLength = array[i].length();
            }
            for (int i = 0; i < n; i++) {
                int additionalSpaces = longestLength - array[i].length();
                StringBuilder build = new StringBuilder("");
                for (int j = 0; j < additionalSpaces; j++)
                    build.append(' ');
                build.append(array[i]);
                System.out.println(build);
            }
        }
    }
}
