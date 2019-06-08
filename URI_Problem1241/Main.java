import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++)
			System.out.println((input.next().endsWith(input.next())) ? "encaixa" : "nao encaixa");
	}
}
