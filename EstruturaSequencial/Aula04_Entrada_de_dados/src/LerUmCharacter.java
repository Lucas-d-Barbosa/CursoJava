import java.util.Scanner;

public class LerUmCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		System.out.println("Caracter digitado: " + x);
		sc.close();
	}

}