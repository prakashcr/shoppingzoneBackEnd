package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {
	public void saveproduct(Product product);
	public Product getProductById(int productId);
	public void deleteProduct(Integer productId);
	public List<Product> getAllProducts();
	
		
	}
