import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float grade1, grade2, grade3, grade4;
        grade1 = input.nextFloat();
        grade2 = input.nextFloat();
        grade3 = input.nextFloat();
        grade4 = input.nextFloat();

        int weight1, weight2, weight3, weight4;

        weight1 = 2;
        weight2 = 3;
        weight3 = 4;
        weight4 = 1;

        float average = (grade1*weight1 + grade2*weight2 + grade3*weight3 + grade4*weight4)/(weight1+weight2+weight3+weight4);
        System.out.printf("Media: %.1f%n", average);

        if (average >= 7.0)
            System.out.println("Aluno aprovado.");
        else if (average < 5.0)
            System.out.println("Aluno reprovado.");
        else if ((average >= 5.0) && (average <= 6.9)) {
            System.out.println("Aluno em exame.");

            float examScore = input.nextFloat();

            System.out.printf("Nota do exame: %.1f%n", examScore);

            float averageExam = (average + examScore) / 2;

            if (averageExam >= 5.0)
                System.out.println("Aluno aprovado.");
            else if (averageExam < 5.0){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", averageExam);
        }

    }

}
