import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while ((scan.hasNextLine())) {
            String input = scan.nextLine();
            boolean passwordIsValid = false;
            boolean hasLowerCase = false;
            boolean hasUpperCase = false;
            boolean hasNumber = false;
            if (input.length() > 5 && input.length() < 33) {
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (Character.isLowerCase(c))
                        hasLowerCase = true;
                    else if (Character.isUpperCase(c))
                        hasUpperCase = true;
                    else if (Character.isDigit(c))
                        hasNumber = true;
                    else {
                        passwordIsValid = false;
                        break;
                    }
                    passwordIsValid = hasLowerCase && hasUpperCase && hasNumber;
                }
            } System.out.println(passwordIsValid ? "Senha valida." : "Senha invalida.");
        }
    }
}
