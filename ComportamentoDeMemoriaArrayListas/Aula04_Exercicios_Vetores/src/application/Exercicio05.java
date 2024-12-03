package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int[] vectA = new int[sc.nextInt()];
		int[] vectB = new int[vectA.length];
		int[] vectC = new int[vectA.length];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		sc.close();
	}

}
