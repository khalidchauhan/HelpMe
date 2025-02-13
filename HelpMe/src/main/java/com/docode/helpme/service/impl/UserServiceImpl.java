package com.docode.helpme.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docode.helpme.model.User;
import com.docode.helpme.repository.UserRepository;
import com.docode.helpme.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	
}
