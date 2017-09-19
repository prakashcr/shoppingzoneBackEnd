package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Product;
import com.niit.model.User;

@Repository
@Transactional
public class ProductDaoimpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;

	public void saveProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);

	}

	public Product getProductById(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);

	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();

	}

	public void deleteProduct(int productId) {
		sessionFactory.getCurrentSession().delete(getProductById(productId));

	}

	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}


	
}

