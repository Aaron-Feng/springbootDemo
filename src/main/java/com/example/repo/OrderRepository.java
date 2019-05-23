package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

}
