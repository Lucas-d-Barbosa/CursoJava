import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantityClientsGas = 0;
		int quantityClientsAl = 0;
		int quantityClientsDis = 0;
		int cod = input.nextInt();
		while(cod != 4) {
			switch(cod) {
				case 1:
					quantityClientsAl += 1;
					break;
				case 2:
					quantityClientsGas += 1;
					break;
				case 3:
					quantityClientsDis += 1;
					break;
				default:
					break;
			}
			cod = input.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + quantityClientsAl);
		System.out.println("Gasolina: " + quantityClientsGas);
		System.out.println("Diesel: " + quantityClientsDis);
		input.close();
	}

}
