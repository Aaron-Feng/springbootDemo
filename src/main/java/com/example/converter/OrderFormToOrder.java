package com.example.converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.entity.Order;
import com.example.entity.Product;
import com.example.param.ShopForm;
import com.example.repo.ProductRepository;

@Component
public class OrderFormToOrder implements Converter<ShopForm, Order>{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Order convert(ShopForm shopForm) {
		Order order = new Order();
		BigDecimal totalPrice=new BigDecimal(0);
		Set<Integer> selectedIds=shopForm.getSelectedProductsId();
		ArrayList<Product> products= (ArrayList<Product>) productRepository.findAllById(selectedIds);
		order.setProducts(products);
		for(Product product : products) {
			totalPrice=product.getPrice().add(totalPrice);
		}
		order.setPrice(totalPrice);
		return order;
	}

}
