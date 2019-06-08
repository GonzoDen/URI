import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double temp = 0;

        if ((b > a) && (b > c)) { // b greatest
            temp = a;
            a = b;
            b = temp;
        }
        else if ((c > b) && (c > b)) { //c greatest
            temp = a;
            a = c;
            c = temp;
        }


        if (a >= (b+c))
            System.out.println("NAO FORMA TRIANGULO");
        else {
            if (a*a == b*b + c*c)
                System.out.println("TRIANGULO RETANGULO");
            if (a*a > b*b + c*c)
                System.out.println("TRIANGULO OBTUSANGULO");
            if (a*a < b*b + c*c)
                System.out.println("TRIANGULO ACUTANGULO");
            if ((a == b) && (b == c))
                System.out.println("TRIANGULO EQUILATERO");
            if ((a == b) && (c != b))
                System.out.println("TRIANGULO ISOSCELES");
            if ((a == c)&&(b != c))
                System.out.println("TRIANGULO ISOSCELES");
            if ((b == c)&&(a != b))
                System.out.println("TRIANGULO ISOSCELES");
        }


    }
}