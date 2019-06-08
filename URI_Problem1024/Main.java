import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String a =scan.nextLine();
        for (int i = 0; i < n; i++) {
            String message = scan.nextLine();
            StringBuilder builder = new StringBuilder("");
            //PART 1
            for (int j = 0; j < message.length(); j++) {
                char letter = message.charAt(j);
                if (Character.isLetter(letter))
                    letter += 3;
                builder.append(letter);
            }
            builder.reverse();
            //PART 2
            for (int j = builder.length()/2; j< builder.length();j++){
                char letter = builder.charAt(j);
                letter--;
                String newLetter = Character.toString(letter);
                builder.replace(j,j+1,newLetter);
            }
            System.out.println(builder);
        }
    }
}
