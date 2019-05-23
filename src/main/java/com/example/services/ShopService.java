package com.example.services;

import java.util.Set;


import com.example.entity.Order;
public interface ShopService {
Set<Order> getOrdersByUser(int userId);
Order saveOrder(Order order);
}
