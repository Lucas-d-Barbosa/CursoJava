
public class Main01 {

	public static void main(String[] args) {
		double price = 400.00;
		double discount;
		if(price < 500.00) {
			discount = price * 0.1;
		}
		else
			discount = 0;
		System.out.println(discount);

	}

}
