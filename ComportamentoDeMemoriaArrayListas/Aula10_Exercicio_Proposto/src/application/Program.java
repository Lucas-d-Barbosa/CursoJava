package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int columns = sc.nextInt();
		int[][] matriz = new int[lines][columns];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		int numberSearch = sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numberSearch) {
					// posição
					System.out.printf("Position %d,%d:%n", i, j);
					
					// left
					if(j > 0) {
						System.out.printf("Left: %d%n", matriz[i][j - 1]);
					}
					
					// top
					if(i > 0) {
						System.out.printf("Up: %d%n", matriz[i - 1][j]);
					}
					
					
					
					// right
					if(j < matriz[i].length - 1) {
						System.out.printf("Right: %d%n", matriz[i][j + 1]);
					}
					
					// down
					if(i < matriz.length - 1) {
						System.out.printf("Down: %d%n", matriz[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
