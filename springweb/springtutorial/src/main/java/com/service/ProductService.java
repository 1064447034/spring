package com.service;

import com.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);
	
}
