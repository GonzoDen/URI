import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String group, clas, order;
        group = input.next();
        clas = input.next();
        order = input.next();

        if (group.equals("vertebrado")) {
            if (clas.equals("ave")) {
                if (order.equals("carnivoro"))
                    System.out.println("aguia");
                else if (order.equals("onivoro"))
                    System.out.println("pomba");
            }
            else if (clas.equals("mamifero")){
                if (order.equals("onivoro"))
                    System.out.println("homem");
                else if (order.equals("herbivoro"))
                    System.out.println("vaca");
            }

        }

        else if (group.equals("invertebrado")){
            if (clas.equals("inseto")) {
                if (order.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if (order.equals("herbivoro"))
                    System.out.println("lagarta");
            }
            else if (clas.equals("anelideo"))
                if (order.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if (order.equals("onivoro"))
                    System.out.println("minhoca");

        }

    }
}
