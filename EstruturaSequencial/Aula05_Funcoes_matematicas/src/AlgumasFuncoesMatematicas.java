
public class AlgumasFuncoesMatematicas {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + z + " = " + C);
	
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);
		
		System.out.printf("%.1f eleveado a %.1f = %.2f%n", x, y, A);
		System.out.printf("%.1f eleveado ao quadrado = %.2f%n", x, B);
		System.out.printf("5 eleveado ao quadrado = %.2f%n",C);
	
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.printf("Valor absoluto de %.2f = %.2f%n", x, A);
		System.out.printf("Valor absoluto de %.2f = %.2f%n", z, B);
	}

}
