import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double a, b, c;
		
		for(int i = 0; i < n; i++) {
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			System.out.printf("%.1f%n", (a * 2 + b * 3 + c * 5) / 10);
		}
		
		input.close();
	}

}
