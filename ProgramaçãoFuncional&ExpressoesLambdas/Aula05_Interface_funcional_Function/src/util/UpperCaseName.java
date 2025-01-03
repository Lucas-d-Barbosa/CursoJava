package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, Product>{

	@Override
	public Product apply(Product prod) {
		prod.setName(prod.getName().toUpperCase());
		return prod;
	}
	
}
