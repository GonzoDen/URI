import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String sentence1 = scan.nextLine();
            String sentence2 = scan.nextLine();
            StringBuilder build = new StringBuilder("");
            int matchingLetters = 0;
            int result = 0;
            int counter = 0;
            for (int i = 0; i + counter < sentence1.length(); i++) {
                char c = sentence1.charAt(i + counter);
                build.append(c);
                if (sentence2.contains(build)) {
                    matchingLetters++;
                    if (i + counter == sentence1.length() - 1) {
                        if (matchingLetters > result)
                            result = matchingLetters;
                    }
                } else {
                    build.delete(0, build.length());
                    if (matchingLetters > result)
                        result = matchingLetters;
                    counter++;
                    matchingLetters = 0;
                    i = -1;
                }

            }
            System.out.println(result);
        }
    }
}
