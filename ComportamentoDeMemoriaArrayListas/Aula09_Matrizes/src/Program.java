import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidadeNumerosNegativos = 0;
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				quantidadeNumerosNegativos += matriz[i][j] < 0 ? 1 : 0;
			}
		}
		System.out.println("Main diagonal:");
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + quantidadeNumerosNegativos);
		sc.close();
	}

}
