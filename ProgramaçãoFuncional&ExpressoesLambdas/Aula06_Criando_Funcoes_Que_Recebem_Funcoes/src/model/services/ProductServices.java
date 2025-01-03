package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductServices {
	public double filteredSum(List<Product> list, Predicate<Product> filter) {
		double sum = 0.0;
		for(Product p : list) {
			if(filter.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
