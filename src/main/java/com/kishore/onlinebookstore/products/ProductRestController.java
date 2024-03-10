package com.kishore.onlinebookstore.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductRestController {
	
	private ProductService service;
	
	@Autowired
	public ProductRestController(ProductService _service) {
		this.service=_service;
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return service.allProducts();
	}
	
	@GetMapping("{productId}")
	public Product getProduct(@PathVariable String productId){
		return service.getProduct(productId);
	}
}
