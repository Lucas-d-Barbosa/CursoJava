import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		
		number = input.nextInt();
		while(number != 0) {
			sum += number;
			number = input.nextInt();
		}
		System.out.println(sum);
		input.close();

	}

}
