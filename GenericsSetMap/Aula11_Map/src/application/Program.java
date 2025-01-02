package application;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "Lucas Barbosa");
		cookies.put("email", "lucas@gmail.com");
		cookies.put("fone", "(85) 9 9941-1992");
		cookies.put("fone", "(85) 9 8769-8892");
		
		System.out.println(cookies);
		cookies.remove("email");
		System.out.println("Contains 'phone' key: " + cookies.containsKey("fone"));
		System.out.println("Phone number: " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		sc.close();
	}

}
