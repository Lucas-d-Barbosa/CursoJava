package util;

public class Calculator {
	public static double IOF = 0.06;
	public static double dolarPrice;
	public static double transation(double dolarQuantity) { 
		return  (dolarQuantity * dolarPrice) +  (dolarQuantity * dolarPrice) * IOF;
	}
}
