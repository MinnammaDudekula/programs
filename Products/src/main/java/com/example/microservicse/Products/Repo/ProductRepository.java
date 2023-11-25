package com.example.microservicse.Products.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.microservicse.Products.Model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
