import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            char[] input = scan.nextLine().toCharArray();
            Arrays.sort(input);
            String diet = new String(input);

            String breakfast = scan.nextLine();
            String lunch = scan.nextLine();

            StringBuilder build = new StringBuilder("");
            ArrayList<Character> list = new ArrayList<>();

            boolean wasCheater = knowWhatIsAlreadyEaten(breakfast, diet, list)
                    || knowWhatIsAlreadyEaten(lunch, diet, list);
            if (wasCheater)
                continue;

            for (int j = 0; j < diet.length(); j++) {
                if (!list.contains(diet.charAt(j)))
                    build.append(diet.charAt(j));
            }
            System.out.println(build);
        }
    }

    private static boolean knowWhatIsAlreadyEaten(String food, String diet, ArrayList<Character> list) {
        for (int j = 0; j < food.length(); j++) {
            char c = food.charAt(j);
            if (!diet.contains(Character.toString(c)) || list.contains(c)) {
                System.out.println("CHEATER");
                return true;
            } else
                list.add(c);
        }
        return false;
    }
}
