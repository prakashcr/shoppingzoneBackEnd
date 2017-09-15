package com.niit.dao;


import com.niit.model.CartItem;

public interface CartItemDao {
	/*public void addCartItem(CartItem cartItem);

	*/
	
	public void deleteCartItem(int cartitemid);
	public CartItem getCartItemByProductId(int pid,int cartid);

	

	
}
