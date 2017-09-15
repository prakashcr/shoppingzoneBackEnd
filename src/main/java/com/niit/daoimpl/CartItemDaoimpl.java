package com.niit.daoimpl;

import org.springframework.stereotype.Repository;

import com.niit.dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;

@Repository("CartItemDao")
public class CartItemDaoimpl implements CartItemDao {

	public void addCartItem(CartItem cartItem) {

	}

	public void deleteCartItem(int cartItemId) {

	}

	public void deleteAllCartItem(int cartId) {

	}

	public Cart getCart(int cartId) {

		return null;
	}

	public CartItem getCartItemByProductId(int pid, int cid) {
		return null;

			}

}
