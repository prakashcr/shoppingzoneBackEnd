package com.niit.model;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Component
@Table (name="Product")
public class Product {
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	
	private int pid;
	@Size(min=2)
	private String pname;
	@NotNull
	private int price;
	@NotEmpty
	private String brandname;
	@NotEmpty
	private String stock;
	
	@ManyToOne
	//@JoinColumn(name="CAT_ID")
	private Category category;
	
	
	@Transient
	private MultipartFile image;
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	 
	public String getBrandname() {
		return brandname;
	}
	
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	public String getStock() {
		return stock;
	}
	
	public void setStock(String stock) {
		this.stock = stock;
	}
	
}
	
	
	