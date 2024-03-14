package com.kishore.onlinebookstore.products;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplWithDummyData implements ProductService {
	
	List<Product> products = Stream.of(new Product(1L, "Buiscuits", "BSK"), 
			new Product(2L, "Chips", "CHP"),
			new Product(3L, "Chocolates", "CHC"))
			.collect(Collectors.toList());
	
	@Override
	public List<Product> allProducts() {
		return products;
	}

	@Override
	public Product getProduct(String productId) {
		Long id = Long.parseLong(productId);
		return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}

}
