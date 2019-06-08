import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double salary, nadbavka, salaryNew,percent;
        salary = input.nextFloat();

        if ((salary >= 0) && (salary <= 400.00)) {
            nadbavka = salary*0.15;
            salaryNew = salary + nadbavka;
        }
        else if ((salary >= 400.01) && (salary <= 800.00)) {
            nadbavka = salary*0.12;
            salaryNew = salary + nadbavka;
        }
        else if ((salary >= 800.01) && (salary <= 1200.00)) {
            nadbavka = salary*0.10;
            salaryNew = salary + nadbavka;
        }
        else if ((salary >= 1200.01) && (salary <= 2000.00)) {
            nadbavka = salary*0.07;
            salaryNew = salary + nadbavka;

        }
        else{
            nadbavka = salary*0.04;
            salaryNew = salary + nadbavka;

        } double salary3=salaryNew-salary;
        percent = ((salary3)/(salary/100));
        System.out.printf("Novo salario: %.2f%n", salaryNew);
        System.out.printf("Reajuste ganho: %.2f%n", nadbavka);
        System.out.printf("Em percentual: %.0f",percent);
        System.out.print(" %\n");

    }
}