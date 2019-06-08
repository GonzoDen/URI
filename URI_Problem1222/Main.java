import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while ((scan.hasNextLine())) {
            int numberOfWords = scan.nextInt();
            int numberOfLines = scan.nextInt();
            int numberOfChars = scan.nextInt();
            String input = scan.nextLine();
            input = scan.nextLine();
            Scanner scan2 = new Scanner(input);
            int pages = 1;
            int lines = 1;
            int chars = 0;
            for (int i = 0; i < numberOfWords; i++) {
                String word = scan2.next();
                if (chars + word.length() <= numberOfChars) {
                    chars += word.length();
                    if (chars < numberOfChars)
                        chars++;
                } else {
                    lines++;
                    if (lines > numberOfLines) {
                        pages++;
                        lines = 1;
                    }
                    chars = word.length();
                    if (chars < numberOfChars)
                        chars++;
                }
            }
            System.out.println(pages);
        }
    }
}
