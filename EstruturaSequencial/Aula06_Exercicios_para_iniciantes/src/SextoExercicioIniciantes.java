import java.util.Locale;
import java.util.Scanner;

public class SextoExercicioIniciantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		areaTriangulo = a * c / 2;
		areaCirculo = 3.14159 * c * c;
		areaTrapezio = (a + b) * c / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n",areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
		input.close();

	}

}
