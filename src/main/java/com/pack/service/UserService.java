package com.pack.service;

import java.util.List;

import com.pack.model.Category;
import com.pack.model.Product;
import com.pack.model.ShoppingCart;
import com.pack.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUser();

	User checkLogin(User user);

	List<Category> getAllCategory();

	Product saveProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(Integer id);

	void deleteProductById(Integer productId);

	ShoppingCart saveCartCreatedTime(ShoppingCart cart);

}
