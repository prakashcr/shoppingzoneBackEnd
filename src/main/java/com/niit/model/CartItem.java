package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cartitemid;

	@OneToOne
	private Product product;
	private int subQty;
	private int subTotalCost;
	@ManyToOne
	private Cart cart;

	public int getCartitemid() {
		return cartitemid;
	}

	public void setCartitemid(int cartitemid) {
		this.cartitemid = cartitemid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getSubQty() {
		return subQty;
	}

	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}

	public int getSubTotalCost() {
		return subTotalCost;
	}

	public void setSubTotalCost(int subTotalCost) {
		this.subTotalCost = subTotalCost;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
