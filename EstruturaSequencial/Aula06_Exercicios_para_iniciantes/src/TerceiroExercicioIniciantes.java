import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicioIniciantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		int diferenca = a * b - c * d;
		System.out.println("Diferença = " + diferenca);
		
		input.close();
	}

}
