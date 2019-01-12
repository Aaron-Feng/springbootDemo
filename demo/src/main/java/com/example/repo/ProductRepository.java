package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
