package com.pack.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Category;
import com.pack.model.Product;
import com.pack.model.ShoppingCart;
import com.pack.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public User saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from User ").list();
	}

	@Override
	public User checkLogin(User user) {
		
		User us = null;
		
		List<User> users = entityManager.createQuery("select new " + User.class.getName() + "(u.id,u.firstName, u.lastName, u.city, u.mobileNumber,u.userName,u.password,u.userType) from User u where u.userName =:userName and u.password = :password")
                .setParameter("userName", user.getUserName())
                .setParameter("password", user.getPassword())
                .getResultList();
		
		if(users.size() > 0){
			us = users.get(0);
		}
        return us;
	}

	
	@Override
	public List<Category> getAllCategory() {
		return sessionFactory.getCurrentSession().createQuery("from Category ").list();
	}
	
	@Override
	public Product saveProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return product;
	}
	
	@Override
	public List<Product> getAllProduct() {
		return sessionFactory.getCurrentSession().createQuery("from Product ").list();
	}
	@Override
	public Product getProductById(Integer productId) {
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product p where p.id =:productId")
				.setParameter("productId", productId).list().get(0);
	}
	
	@Override
	public void deleteProductById(Integer productId) {
		 sessionFactory.getCurrentSession().createQuery("Delete from Product p where p.id =:productId")
				.setParameter("productId", productId).executeUpdate();
	}
	@Override
	public ShoppingCart saveCartCreatedTime(ShoppingCart cart) {
		sessionFactory.getCurrentSession().save(cart);
		return cart;
	}
	
}
