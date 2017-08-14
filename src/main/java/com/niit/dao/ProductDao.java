package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {
	public void saveProduct(Product product);

	public Product getProductById(int productId);

	public void deleteProduct(int productId);

	public List<Product> getAllProducts();

	public void updateProduct(Product product);

}
