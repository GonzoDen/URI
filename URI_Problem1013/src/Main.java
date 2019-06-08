import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c, absAB, absBC, absF, maior1, maior2, maiorFinal;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        absAB = Math.abs(a-b);
        absBC = Math.abs(b-c);

        maior1 = (a+b+absAB)/2;
        maior2 = (b+c+absBC)/2;

        absF = Math.abs(maior1 - maior2);
        maiorFinal = (maior1 + maior2 + absF)/2;

        System.out.println(maiorFinal + " eh o maior");

    }

}