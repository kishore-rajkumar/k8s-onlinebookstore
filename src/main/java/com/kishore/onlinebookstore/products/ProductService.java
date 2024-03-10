package com.kishore.onlinebookstore.products;

import java.util.List;

public interface ProductService {

	List<Product> allProducts();

	Product getProduct(String productId);

}
