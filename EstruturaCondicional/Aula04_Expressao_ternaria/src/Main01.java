
public class Main01 {

	public static void main(String[] args) {
		double preco = 10.5;
		double desconto;
		desconto = preco < 20 
				? preco * 0.1 
				: preco * 0.05;
		System.out.printf("Value Final: R$ %.2f%n", (preco - desconto));
	}

}
