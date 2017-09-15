package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Product;
import com.niit.model.User;

public interface ProductDao {
	public void saveProduct(Product product);

	public Product getProductById(int productId);

	public void deleteProduct(int productId);

	public List<Product> getAllProducts();

	public void updateProduct(Product product);

	

	


}
