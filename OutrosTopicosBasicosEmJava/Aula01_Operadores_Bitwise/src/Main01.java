import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mask = 0b100000;
		int n = input.nextInt();
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		input.close();
	}

}
