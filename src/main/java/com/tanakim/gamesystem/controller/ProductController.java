package com.tanakim.gamesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tanakim.gamesystem.entity.Product;
import com.tanakim.gamesystem.service.ProductService;
@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public String ListProduct(Model model, @Param("keyword") String keyword) {
		List<Product> theProduct = productService.listAll(keyword);
		model.addAttribute("products", theProduct);
		model.addAttribute("keyword", keyword);
		
		return "products/list-prducts";
	}
}
