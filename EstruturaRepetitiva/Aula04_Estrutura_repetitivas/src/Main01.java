import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("i = " + i);
		}
		
		input.close();
	}

}
