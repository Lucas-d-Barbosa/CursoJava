import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.print("Digite uma hora: ");
		hora = sc.nextInt();
		if(hora < 12) { // Não obrigatório caso só tenha uma instrução no if
			System.out.println("Bom dia");
		}
		else if(hora < 18) {
			System.out.println("Boa tarde");			
		}
		else // Sem as chaves pois só está com uma instrução no if
			System.out.println("Boa noite");
		sc.close();
	}

}