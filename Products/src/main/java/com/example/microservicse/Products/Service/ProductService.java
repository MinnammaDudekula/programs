package com.example.microservicse.Products.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservicse.Products.Model.Product;
import com.example.microservicse.Products.Repo.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Optional<Product> getProductById(String id) {
		return productRepository.findById(id);
	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public void updateProduct(String id, Product product) {
		if (productRepository.existsById(id)) {
			product.setId(id);
			productRepository.save(product);
		}
		// Handle error if the product with the given ID does not exist
	}

	public void deleteProduct(String id) {
		productRepository.deleteById(id);
	}
}
