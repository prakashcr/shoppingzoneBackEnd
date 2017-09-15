package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartDao;
import com.niit.model.Cart;

@Repository("CartDao")
public class CartDaoimpl implements CartDao {
	@Autowired
	SessionFactory sessionFactory;

	public Cart getCartById(int cartId) {

		return null;
	}

	public void saveCart(Cart cart) {

		sessionFactory.getCurrentSession().save(cart);
	}

	public List<Cart> getCartByUsername(String username) {

		return null;
	}

}
