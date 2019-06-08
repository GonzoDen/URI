import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while ((scan.hasNextLine())) {
            String input = scan.nextLine().toLowerCase();
            int result = 0;
            Scanner scan2 = new Scanner(input);
            String word1 = scan2.next();
            char similarLetter = ' ';
            while (scan2.hasNext()) {
                String word2 = scan2.next();
                if (word1.charAt(0) == word2.charAt(0) && word2.charAt(0) != similarLetter) {
                    result++;
                    similarLetter = word2.charAt(0);
                } else if (word1.charAt(0) != word2.charAt(0))
                    similarLetter = ' ';
                word1 = word2;
            } System.out.println(result);
        }
    }
}
