package com.niit.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoimpl implements ProductDao{
@Autowired
SessionFactory sessionFactory;

public void saveproduct(Product product)
{
	sessionFactory.getCurrentSession().save(product);

}
}
