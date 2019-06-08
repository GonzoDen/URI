import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int originalLines = scan.nextInt();
            int originalColumns = scan.nextInt();
            if (originalLines == 0 && originalColumns == 0)
                break;
            scan.nextLine();
            String[] drawing = new String[originalLines];
            for (int i = 0; i < originalLines; i++)
                drawing[i] = scan.nextLine();
            int newLines = scan.nextInt();
            int newColumns = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < originalLines; i++) {
                for (int h = 0; h < newLines / originalLines; h++) {
                    StringBuilder build = new StringBuilder("");
                    for (int j = 0; j < drawing[i].length(); j++) {
                        for (int k = 0; k < newColumns / originalColumns; k++)
                            build.append(drawing[i].charAt(j));
                    }
                    System.out.println(build);
                }
            } System.out.println();
        }
    }
}
