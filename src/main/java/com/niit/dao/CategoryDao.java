package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDao {
	public void saveCategory(Category cat);
	public List<Category> retrieveAllCategory();

}
