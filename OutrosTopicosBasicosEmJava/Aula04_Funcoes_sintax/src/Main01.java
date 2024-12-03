import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println(soma(10, 20));
		System.out.println("Enter three number: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("The biggest is: " + biggest(a, b, c));
		input.close();
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int biggest(int a, int b, int c) {
		int biggest = a;
		biggest = b > a ? b : a;
		biggest = c > biggest ? c : biggest;
		return biggest;
	}

}
