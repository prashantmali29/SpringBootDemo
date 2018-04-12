package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.model.Category;
import com.pack.model.Product;
import com.pack.model.ShoppingCart;
import com.pack.model.User;
import com.pack.service.UserService;

@RestController
public class SampleRestController {

	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public User  saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public List<User>  getAllUser(){
		return userService.getAllUser();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public User  checkLogin(@RequestBody User user){
		return userService.checkLogin(user);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getCategory", method = RequestMethod.GET)
	public List<Category>  getAllCategory(){
		return userService.getAllCategory();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public Product  saveProduct(@RequestBody Product product){
		return userService.saveProduct(product);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getAllProduct", method = RequestMethod.GET)
	public  List<Product>  getAllProduct(){
		return userService.getAllProduct();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getProductById/{productId}", method = RequestMethod.GET)
	public  Product  getProductById(@PathVariable("productId") Integer productId){
		return userService.getProductById(productId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/deleteProductById/{productId}", method = RequestMethod.GET)
	public  void  deleteProductById(@PathVariable("productId") Integer productId){
		 userService.deleteProductById(productId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/saveCartCreatedTime", method = RequestMethod.GET)
	public  ShoppingCart  saveCartCreatedTime(@RequestBody ShoppingCart cart){
		return userService.saveCartCreatedTime(cart);
	}
}
