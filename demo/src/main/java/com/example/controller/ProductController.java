package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.services.ProductService;

@Controller
public class ProductController {
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService=productService;
	}
	
	@RequestMapping("/")
	public String redirToList() {
		return "redirect:/product/productList";
	}
	
	@RequestMapping({"/product/productList","/product"})
	public String listProducts(Model model){
		model.addAttribute("products",productService.listAll());
		return "product/productList";
	}
	
	@RequestMapping("/product/productShow/{id}")
	public String getProduct(@PathVariable String id, Model model) {
		model.addAttribute("product",productService.getById(Integer.valueOf(id)));
		return "product/productShow";
	}
}
