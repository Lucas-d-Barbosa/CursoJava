package application;

public class Program {

	public static void main(String[] args) {
		int x = 20;
		Object obj = x; // Boxing referencia = valor compativel
		System.out.println(obj);
		int y = (int) obj; // Unboxing - valor = referencia compativel
		System.out.println(y);
		Integer integer = x; // Não precisa do casting pois é um tipo compatível direto
		System.out.println(integer);
	}

}
