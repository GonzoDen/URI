import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String number = scan.nextLine();
            String cutoff = scan.nextLine();
            StringBuilder build = new StringBuilder();
            double a;
            if (number.charAt(0) == '.') {
                build.append('0');
                build.append(number);
                a = Double.parseDouble(number);
                build.delete(0, build.length());
            } else {
                a = Double.parseDouble(number);
            }
            double b = Double.parseDouble(cutoff);
            double precision1 = a - (int) a;
            double precision2 = b - (int) b;
            if (precision1 > precision2)
                a = Math.ceil(a);
            else
                a = Math.floor(a);
            System.out.println((int)a);
        }
    }
}
