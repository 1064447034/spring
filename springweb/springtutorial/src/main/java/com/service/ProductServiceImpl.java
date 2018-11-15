package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Long, Product> products = new HashMap<Long, Product>();
	private AtomicLong generator = new AtomicLong();
	
	public ProductServiceImpl() {
		Product product = new Product();
		product.setName("JX1 power Drill");
		product.setDescription("powerful hand drill, made to perfection");
		product.setPrice(129.99F);
		add(product);
	}
	
	@Override
	public Product add(Product product) {
		long newId = generator.incrementAndGet();
		product.setId(newId);
		products.put(newId, product);
		return product;
	}
	
	@Override
	public Product get(long id) {
		return products.get(id);
	}
	
}
