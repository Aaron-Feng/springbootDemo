package com.example.services;

import java.util.List;

import com.example.entity.Product;

public interface ProductService {
List<Product> listAll();
Product getById(int id);
Product saveOrUpdate(Product product);
void delete(int id);
}
