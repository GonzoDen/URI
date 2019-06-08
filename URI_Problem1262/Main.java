import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            int procs = Integer.parseInt(scan.nextLine());
            int numberOfCycles = 0;
            int chainOfReads = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'W') {
                    numberOfCycles++;
                    if (chainOfReads > 0) {
                        numberOfCycles++;
                        chainOfReads = 0;
                    }
                } else {
                    chainOfReads++;
                    if (chainOfReads >= procs) {
                        numberOfCycles++;
                        chainOfReads = 0;
                    } else if (i == input.length() - 1)
                        numberOfCycles++;
                }
            }
            System.out.println(numberOfCycles);
        }
    }
}
