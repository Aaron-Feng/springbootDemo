package com.example.servicesImpl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.entity.User;
import com.example.repo.OrderRepository;
import com.example.repo.UserRepository;
import com.example.services.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	private OrderRepository orderRepository;
	private UserRepository userRepository;

	@Autowired
	public ShopServiceImpl(OrderRepository orderRepository, UserRepository userRepository) {
		this.orderRepository = orderRepository;
		this.userRepository = userRepository;
	}

	@Override
	public Set<Order> getOrdersByUser(int userId) {
		Set<Order> orders = new HashSet<>();
		User user = userRepository.findById(userId).get();
		orders = user.getOrders();
		return orders;
	}

	@Override
	public Order saveOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder;
	}

}
