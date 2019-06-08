import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scan.nextLine());
            if (n == 0)
                break;
            int numberOfSolved = 0;
            int totalTime = 0;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String input = scan.nextLine();
                Scanner scan2 = new Scanner(input);
                String problem = scan2.next();
                if (!map.containsKey(problem)) {
                    map.put(problem, 0);
                }
                int time = Integer.parseInt(scan2.next());
                String isCorrect = scan2.next();
                if (isCorrect.equals("correct")) {
                    totalTime += time + map.get(problem) * 20;
                    numberOfSolved++;
                } else {
                    map.put(problem, map.get(problem) + 1);
                }
            }
            System.out.println(numberOfSolved + " " + totalTime);
        }
    }
}
