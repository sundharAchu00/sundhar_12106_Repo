package com.sbmobilerepairapp.repository;

import java.util.List;

import com.sbmobilerepairapp.entity.User;

public interface UserRepo {
	

	List<String> getAlluEmail();
	
	User getByuEmail(String uEmail);
	
	List<User> getAllUsers();
	
	boolean saveUser(User user);
	
	public User getUserById(int id);
	
	
	

	
}
