import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a, b;
		
		for(int i = 0; i < n; i++) {
			a = input.nextInt();
			b = input.nextInt();
			if(b == 0) {
				System.out.println("divisao impossivel");
				continue;
			}
			System.out.println((double) a / b);
		}
		
		input.close();
	}

}
