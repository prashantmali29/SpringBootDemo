package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.UserDao;
import com.pack.model.Category;
import com.pack.model.Product;
import com.pack.model.ShoppingCart;
import com.pack.model.User;

@Service
public class UserServiceImpl implements  UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	@Transactional
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	@Transactional
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public User checkLogin(User user) {
		return userDao.checkLogin(user);
	}
	
	@Override
	@Transactional
	public List<Category> getAllCategory() {
		return userDao.getAllCategory();
	}
	
	@Override
	@Transactional
	public Product saveProduct(Product product) {
		return userDao.saveProduct(product);
	}
	
	@Override
	@Transactional
	public List<Product> getAllProduct() {
		return userDao.getAllProduct();
	}
	
	@Override
	@Transactional
	public Product getProductById(Integer productId) {
		return userDao.getProductById(productId);
	}
	
	@Override
	@Transactional
	public void deleteProductById(Integer productId) {
		userDao.deleteProductById(productId);
	}
	
	@Override
	@Transactional
	public ShoppingCart saveCartCreatedTime(ShoppingCart cart) {
		return userDao.saveCartCreatedTime(cart);
	}

}
