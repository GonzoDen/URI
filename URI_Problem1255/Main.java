import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scan.nextLine().toLowerCase();

            int[] letters = new int[26];
            for (int j = 0; j < message.length(); j++) {
                char letter = message.charAt(j);
                if (Character.isLetter(letter))
                    letters[letter - 'a']++;
            }

            ArrayList a = new ArrayList();
            int value = 0;
            for (int k = 0; k < letters.length; k++) {
                if (letters[k] > value) {
                    a.clear();
                    a.add((char) (k + 'a'));
                    value = letters[k];
                } else if (letters[k] == value)
                    a.add((char) (k + 'a'));
            }
            StringBuilder b = new StringBuilder("");
            for (int k = 0; k < a.size(); k++)
                b.append(a.toArray()[k]);
            System.out.println(b);
        }
    }
}
