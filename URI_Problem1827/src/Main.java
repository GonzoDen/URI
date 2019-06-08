import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            if (!input.hasNext()) {
                break;
            }

            int num = input.nextInt();

            int[][] matrix = new int[num][num];

            int innerSquare = num - num / 3;

            for (int i = 0; i < num; i++) {
                matrix[i][num - 1 - i] = 3;
                matrix[i][i] = 2;
            }

            for (int i = num / 3; i < innerSquare; i++) {
                for (int j = num / 3; j < innerSquare; j++)
                    matrix[i][j] = 1;
            }

            matrix[num / 2][num / 2] = 4;

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (j == num - 1) {
                        System.out.println(matrix[i][j]);

                    } else
                        System.out.print(matrix[i][j]);
                }

            }

            System.out.println();

        } while (true);
    }
}
