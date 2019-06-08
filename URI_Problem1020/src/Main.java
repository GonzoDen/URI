import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int age, ano, mes, dia;
        age = input.nextInt();
        ano = age /365;
        mes = age % 365 / 30;
        dia = age % 365 % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }


}