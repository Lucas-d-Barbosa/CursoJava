import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		
		while(true) {
			x = input.nextInt();
			y = input.nextInt();
			if(x == 0 || y == 0) {
				break;
			}
			else if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			
			else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			else {
				System.out.println("terceiro");
			}
		}
		
		input.close();

	}

}
