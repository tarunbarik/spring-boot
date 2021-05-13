package com.slksoft.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slksoft.springboot.model.Product;
import com.slksoft.springboot.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllTopics() {
		return productService.getAllProducts();
	}// getAllTopics

	@GetMapping("/products/{pId}")
	public Product getProduct(@PathVariable("pId") String id) {
		return productService.getProduct(id);
	}// getProduct

	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}// addProduct

	@PutMapping("/products/{pId}")
	public void updateProduct(@RequestBody Product product, @PathVariable("pId") String id) {
		productService.updateProduct(id, product);
	}//updateProduct
	
	@DeleteMapping("/products/{pId}")
	public void deleteProduct(@PathVariable("pId") String id) {
		productService.deleteProduct(id);
	}//deleteProduct
	
}// class
