import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String notResponsive = "";
        String originalValue = "";
        while (true) {
            notResponsive = scan.next();
            char notResponsiveDigit = notResponsive.charAt(0);
            originalValue = scan.next();
            if (notResponsive.equals("0") && originalValue.equals("0"))
                break;
            StringBuilder newValue = new StringBuilder("");
            for (int i = 0; i < originalValue.length(); i++) {
                char digit = originalValue.charAt(i);
                if (digit != notResponsiveDigit)
                    newValue.append(digit);
            }
            while (!newValue.toString().equals("") && newValue.charAt(0) == '0'){
                newValue.deleteCharAt(0);
            }
            if (newValue.toString().equals(""))
                newValue.append('0');
            System.out.println(newValue);
        }
    }
}
