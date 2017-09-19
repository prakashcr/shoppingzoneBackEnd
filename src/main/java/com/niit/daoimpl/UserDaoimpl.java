package com.niit.daoimpl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

	@Repository
	@Transactional
	public class UserDaoimpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
		public void saveUser(User user)
		{
			try{
				System.out.println(user.getUserName());
			 sessionFactory.getCurrentSession().save(user);
		sessionFactory.getCurrentSession().flush();
		System.out.println(user.getUserName());
		
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		public User  getUserByUsername(String username) {
			
		User user= (User) sessionFactory.getCurrentSession().createQuery("FROM User WHERE username = '"+username+"'").uniqueResult();

			
			return user;
		}
	}
