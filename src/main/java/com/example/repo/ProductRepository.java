package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
