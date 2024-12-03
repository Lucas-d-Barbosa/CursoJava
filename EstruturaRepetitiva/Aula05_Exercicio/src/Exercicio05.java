import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n == 0)
			n = 1;
		for(int i = n - 1; i > 1; i--) {
			n *= i;
		}
		
		System.out.println(n);
		
		input.close();
	}

}
