import java.util.Locale;
import java.util.Scanner;

public class LerNumDouble {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Double x = sc.nextDouble();
			System.out.println("Número flutuante digitado: " + x);
			sc.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}

}